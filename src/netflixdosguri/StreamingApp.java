package netflixdosguri;

import netflixdosguri.plataforma.Plataforma;
import netflixdosguri.streaming.Streaming;
import netflixdosguri.usuario.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class StreamingApp {
    private ArrayList<Usuario> usuarios;
    private Usuario usuario = new Usuario();
    private ArrayList<Streaming> conteudos;

    public void menuInicial() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println
                    ("(1) - Usuario\n" +
                            "(2) - Admin\n" +
                            "(3) - Sair");

            System.out.print("Escolha: ");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    menuUsuario();
                    break;
                case 2:
                    menuAdmin();
                    break;
                case 3:
                    return;
            }
        }
    }

    public void menuUsuario() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println
                    ("(1) - Adicionar Usuario\n" +
                            "(2) - Ver Conteúdos Disponíveis\n" +
                            "(3) - Gerenciar Perfil\n" +
                            "(4) - Ver Status de Assinatura\n" +
                            "(5) - Sair\n");

            System.out.print("Escolha: ");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Novo Usuário");

                    System.out.print("Nome: ");
                    sc.nextLine();
                    String nome = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    System.out.print("Senha: ");
                    String senha = sc.nextLine();

                    System.out.print("Data de Nascimento: ");
                    String dataNascimento = sc.nextLine();

                    Plataforma.adicionarUsuario(nome, email, senha, dataNascimento);
                case 2:
                    Plataforma.exibirConteudos();
                case 3:
                    // falta gerenciar perfil
                case 4:
                    // falta status de assinatura
                case 5:
                    return;
            }
        }
    }

    public void menuAdmin() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println
                    ("(1) - Adicionar Conteúdo (Filme/Série)\n" +
                            "(2) - Editar Conteúdo (Filme/Série)\n" +
                            "(3) - Exibir Usuários\n" +
                            "(4) - Exibir Conteúdos\n" +
                            "(5) - Sair\n");

            System.out.print("Escolha: ");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Adicionar Filme(1) | Adicionar Série(2)");
                    System.out.print("Escolha: ");
                    escolha = sc.nextInt();

                    System.out.print("Titulo: ");
                    sc.nextLine();
                    String titulo = sc.nextLine();

                    System.out.print("Genero: ");
                    String genero = sc.nextLine();

                    System.out.print("Duração: ");
                    int duracao = sc.nextInt();

                    System.out.print("Diretor: ");
                    sc.nextLine();
                    String diretor = sc.nextLine();

                    System.out.print("Classificação Etaria: ");
                    int classificacaoEtaria = sc.nextInt();

                    System.out.println("Filme adicionado com sucesso!");
                    Plataforma.adicionarConteudo(escolha, titulo, genero, duracao, diretor, classificacaoEtaria);
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        StreamingApp streaming = new StreamingApp();

        streaming.menuInicial();
    }
}