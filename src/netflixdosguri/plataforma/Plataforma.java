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

    public Plataforma(String nome, ArrayList<Usuario> usuarios, ArrayList<Streaming> conteudos) {
        this.nome = nome;
        this.usuarios = usuarios;
        this.conteudos = conteudos;
    }

    public Plataforma(String nome) {
        this.nome = nome;
    }

    public Plataforma() {
    }

    public static void adicionarUsuario(String nome, String email, String senha, String dataNascimento) {
        Usuario usuario = new Usuario(nome, email, senha, dataNascimento);
        usuarios.add(usuario);
    }

    public void adicionarConteudo(Streaming conteudo) {
        conteudos.add(conteudo);
    }

    public static void exibirUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }

    public static void exibirConteudos() {
        for (Streaming conteudo : conteudos) {
            System.out.println(conteudo);
        }
    }

public static void adicionarConteudo(int escolha, String titulo, String genero, int duracao, String diretor, int classificacaoEtaria) {
        switch (escolha) {
            case 1:
                filme.setTitulo(titulo);
                filme.setGenero(genero);
                filme.setDuracao(duracao);
                filme.setDiretor(diretor);
                filme.setClassificacaoEtaria(classificacaoEtaria);
            case 2:
                serie.setTitulo(titulo);
                serie.setGenero(genero);
                serie.setDuracao(duracao);
                serie.setDiretor(diretor);
                serie.setClassificacaoEtaria(classificacaoEtaria);
        }
    }
}
