public class Carro {
    private String modelo;
    private double preco;

    public Carro(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Preço: R$ " + preco;
    }
}
