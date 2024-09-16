package netflixdosguri.streaming;

public class Filme extends Streaming {
    private String diretor;

    public Filme(String titulo, int duracao, String genero, int classificacaoEtaria, String diretor) {
        super(titulo, duracao, genero, classificacaoEtaria);
        this.diretor = diretor;
    }

    public Filme() {
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
