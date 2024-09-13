package netflixdosguri.usuario;

import netflixdosguri.pagamento.Pagamento;

import java.text.SimpleDateFormat;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private String dataNascimento;
    private Pagamento pagamento;

    public Usuario(String nome, String email, String senha, String dataNascimento, Pagamento pagamento) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.pagamento = pagamento;
    }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
}
