package netflixdosguri.pagamento;

import java.text.SimpleDateFormat;

public class Pagamento {
    private String tipo;  // tipo de pagamento
    private double valor;
    private SimpleDateFormat lancamento = new SimpleDateFormat("dd/MM/yyyy");
}
