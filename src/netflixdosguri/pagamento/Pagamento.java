package netflixdosguri.pagamento;

public class Pagamento {
    private String tipo;  // tipo de pagamento
    private double valor;
    private String data;

    public Pagamento(String tipo, double valor, String data) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
    }
}
