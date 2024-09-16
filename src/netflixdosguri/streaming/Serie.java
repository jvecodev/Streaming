package netflixdosguri.streaming;

public class Serie extends Streaming {
    private int temporadas;
    private int episodios;

    public Serie(String titulo, int duracao, String genero, int classificacaoEtaria, int temporadas, int episodios) {
        super(titulo, duracao, genero, classificacaoEtaria);
        this.temporadas = temporadas;
        this.episodios = episodios;
    }
}
