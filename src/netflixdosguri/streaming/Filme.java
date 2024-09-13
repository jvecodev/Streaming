package netflixdosguri.streaming;

public class Filme extends Streaming {
    private String diretor;

    public Filme(String titulo, int duracao, String genero, String classificacaoEtaria, String diretor) {
        super(titulo, duracao, genero, classificacaoEtaria);
        this.diretor = diretor;
    }
}
