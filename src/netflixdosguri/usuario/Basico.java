package netflixdosguri.usuario;

import netflixdosguri.pagamento.Pagamento;

import java.text.SimpleDateFormat;

public class Basico extends Usuario {
    private int anuncios;

    public Basico(String nome, String email, String senha, SimpleDateFormat dataNascimento, Pagamento pagamento, int anuncios) {
        super(nome, email, senha, dataNascimento, null);
        this.anuncios = anuncios;
    }
}
