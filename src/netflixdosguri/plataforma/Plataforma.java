package netflixdosguri.plataforma;

import netflixdosguri.streaming.Streaming;
import netflixdosguri.usuario.Usuario;

import java.util.ArrayList;

public class Plataforma {
    private String nome;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Streaming> conteudos; // filmes e series

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void adicionarConteudo(Streaming conteudo) {
        conteudos.add(conteudo);
    }

    public void exibirUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }

    public void exibirConteudos() {
        for (Streaming conteudo : conteudos) {
            System.out.println(conteudo);
        }
    }
}
