package netflixdosguri.plataforma;

import netflixdosguri.streaming.Filme;
import netflixdosguri.streaming.Serie;
import netflixdosguri.streaming.Streaming;
import netflixdosguri.usuario.Usuario;

import java.util.ArrayList;

public class Plataforma {
    private String nome;
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static ArrayList<Streaming> conteudos = new ArrayList<>(); // filmes e series
    private static Filme filme = new Filme();
    private static Serie serie = new Serie();
    private static Usuario usuario = new Usuario();

    public Plataforma(String nome, ArrayList<Usuario> usuarios, ArrayList<Streaming> conteudos) {
        this.nome = nome;
        this.usuarios = usuarios;
        this.conteudos = conteudos;
    }

    public Plataforma(String nome) {
        this.nome = nome;
    }

    public Plataforma() {}

    public static void adicionarUsuario(String nome, String email, String senha, String dataNascimento) {
        Usuario usuario = new Usuario(nome, email, senha, dataNascimento);
        usuarios.add(usuario);
    }

    public static void adicionarConteudo(Streaming conteudo) {
        conteudos.add(conteudo);
    }

    public static void exibirUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuario disponível.");
        } else {
            for (int i = 0; i < usuarios.size(); i++) {
                System.out.println((i + 1) + ". " + usuarios.get(i).toString());
            }
        }
    }

    public static void editarUsuario(int opcao, String novoValor) {
        usuarios.toString();

        switch (opcao) {
            case 1:
                usuario.setNome(novoValor);
                break;
            case 2:
                usuario.setEmail(novoValor);
                break;
            case 3:
                usuario.setSenha(novoValor);
                break;
            case 4:
                usuario.setDataNascimento(novoValor);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        System.out.println("Usuario atualizado com sucesso!");
    }


    public static void exibirConteudos() {
        if (conteudos.isEmpty()) {
            System.out.println("Nenhum conteúdo disponível.");
        } else {
            for (int i = 0; i < conteudos.size(); i++) {
                System.out.println((i + 1) + ". " + conteudos.get(i).toString());
            }
        }
    }

    public static void adicionarFilme(String titulo, String genero, int duracao, String diretor, int classificacaoEtaria) {
        filme.setTitulo(titulo);
        filme.setGenero(genero);
        filme.setDuracao(duracao);
        filme.setDiretor(diretor);
        filme.setClassificacaoEtaria(classificacaoEtaria);

        conteudos.add(filme);
    }

    public static void adicionarSerie(String titulo, String genero, int duracao, int temporadas, int episodios, int classificacaoEtaria) {
        serie.setTitulo(titulo);
        serie.setGenero(genero);
        serie.setDuracao(duracao);
        serie.setTemporadas(temporadas);
        serie.setEpisodios(episodios);
        serie.setClassificacaoEtaria(classificacaoEtaria);

        conteudos.add(serie);
    }

    public static void editarConteudo(int indice, int opcao, String novoValor) {
        int indiceCorreto = indice - 1;

        if (indiceCorreto >= 0 && indiceCorreto < conteudos.size()) {
            Streaming conteudo = conteudos.get(indiceCorreto);
            System.out.println("Conteúdo selecionado: " + conteudo.toString());

            switch (opcao) {
                case 1:
                    conteudo.setTitulo(novoValor);
                    System.out.println("Título atualizado para: " + novoValor);
                    break;
                case 2:
                    conteudo.setGenero(novoValor);
                    System.out.println("Gênero atualizado para: " + novoValor);
                    break;
                case 3:
                    conteudo.setDuracao(Integer.parseInt(novoValor));
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            System.out.println("Conteúdo atualizado com sucesso!");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}