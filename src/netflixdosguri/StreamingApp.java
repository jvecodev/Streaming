package netflixdosguri;

import netflixdosguri.plataforma.Plataforma;
import netflixdosguri.streaming.Filme;
import netflixdosguri.streaming.Serie;
import netflixdosguri.streaming.Streaming;
import netflixdosguri.usuario.Basico;
import netflixdosguri.usuario.Premium;
import netflixdosguri.pagamento.Pagamento;
import netflixdosguri.usuario.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class StreamingApp {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Streaming> conteudos;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Plataforma plataforma = new Plataforma("NETFLIX DOS GURI");

        while (true) {
            System.out.println("Menu de Streaming");
            System.out.println("1. Adicionar Usuário");
            System.out.println("2. Adicionar Conteúdo (Filme/Série)");
            System.out.println("3. Exibir Usuários");
            System.out.println("4. Exibir Conteúdos");
            System.out.println("5. Sair");

            System.out.print("Escolha uma opção: ");
            int escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 1:
                    adicionarUsuario(plataforma);
                    break;
                case 2:
                    adicionarConteudo(plataforma);
                    break;
                case 3:
                    plataforma.exibirUsuarios();
                    break;
                case 4:
                    plataforma.exibirConteudos();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }

    private static void adicionarUsuario(Plataforma plataforma) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tipo de usuário: (1) Básico (2) Premium");
        int tipo = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        switch (tipo) {
            case 1:
                Basico usuarioBasico = new Basico(nome, email);
                plataforma.adicionarUsuario(usuarioBasico);
                System.out.println("Usuário básico adicionado com sucesso!");
                break;
            case 2:
                System.out.print("Forma de pagamento: ");
                String formaDePagamento = sc.nextLine();

                System.out.print("Preço do plano: ");
                double valor = sc.nextDouble();
                sc.nextLine();

                System.out.print("Data do pagamento (dd-mm-yyyy): ");
                String data = sc.nextLine();
                Pagamento pagamento = new Pagamento(formaDePagamento, valor, data);

                Premium usuarioPremium = new Premium(nome, email, pagamento, true);
                plataforma.adicionarUsuario(usuarioPremium);
                System.out.println("Usuário premium adicionado com sucesso!");
                break;
            default:
                System.out.println("Tipo de usuário inválido.");
                break;
        }
    }

    private static void adicionarConteudo(Plataforma plataforma) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tipo de conteúdo: (1) Filme (2) Série");
        int tipo = sc.nextInt();
        sc.nextLine();

        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("Duração (minutos): ");
        int duracao = sc.nextInt();
        sc.nextLine();

        System.out.print("Gênero: ");
        String genero = sc.nextLine();

        System.out.print("Classificação etária: ");
        String classificacaoEtaria = sc.nextLine();

        switch (tipo) {
            case 1:
                System.out.print("Diretor: ");
                String diretor = sc.nextLine();

                Filme filme = new Filme(titulo, duracao, genero, classificacaoEtaria, diretor);
                plataforma.adicionarConteudo(filme);
                System.out.println("Filme adicionado com sucesso!");
                break;
            case 2:
                System.out.print("Número de temporadas: ");
                int temporadas = sc.nextInt();

                System.out.print("Número de episódios: ");
                int episodios = sc.nextInt();
                sc.nextLine();

                Serie serie = new Serie(titulo, duracao, genero, classificacaoEtaria, temporadas, episodios);
                plataforma.adicionarConteudo(serie);
                System.out.println("Série adicionada com sucesso!");
                break;
            default:
                System.out.println("Tipo de conteúdo inválido.");
                break;
        }
    }
}
