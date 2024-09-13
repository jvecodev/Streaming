package netflixdosguri.streaming;

import java.text.SimpleDateFormat;

public class Streaming {
    private String titulo;
    private String genero;
    private String classificacaoEtaria;
    private int duracao;
    private SimpleDateFormat lancamento = new SimpleDateFormat("dd/MM/yyyy");

    public Streaming(String titulo, int duracao, String genero, String classificacaoEtaria) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.genero = genero;
        this.classificacaoEtaria = classificacaoEtaria;
    }
}
