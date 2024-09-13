package netflixdosguri.usuario;

import netflixdosguri.pagamento.Pagamento;

import java.text.SimpleDateFormat;

public class Premium extends Usuario {
    private boolean downloadOffline;

    public Premium(String nome, String email, String senha, SimpleDateFormat dataNascimento, Pagamento pagamento, boolean downloadOffline) {
        super(nome, email, senha, dataNascimento, pagamento);
        this.downloadOffline = downloadOffline;
    }
}
