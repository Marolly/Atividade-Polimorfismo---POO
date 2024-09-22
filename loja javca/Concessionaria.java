public class Concessionaria {
    public void comprarCarro(Cliente cliente, Carro carro, double valorPago, int parcelas) {
        double precoCarro = carro.getPreco();
        double restante = precoCarro - valorPago;

        if (valorPago >= precoCarro) {
            System.out.println("Parabéns " + cliente.getNome() + ", você comprou o " + carro.getModelo() + " à vista por R$ " + valorPago);
        } else if (valorPago < precoCarro && parcelas > 0 && parcelas <= 60) {
            if (restante <= 0) {
                System.out.println("Parabéns " + cliente.getNome() + ", você comprou o " + carro.getModelo() + " à vista por R$ " + valorPago);
            } else {
                double valorParcela = restante / parcelas;
                System.out.println("Parabéns " + cliente.getNome() + ", você comprou o " + carro.getModelo() + ". Você pagou R$ " + valorPago +
                        " e parcelou o restante em " + parcelas + "x de R$ " + String.format("%.2f", valorParcela));
            }
        } else {
            System.out.println("Desculpe, " + cliente.getNome() + ". O valor de R$ " + valorPago + " não é suficiente para comprar o " + carro.getModelo() + 
                    ". O carro custa R$ " + precoCarro + ". Você pode tentar parcelar em até 60x.");
        }
    }
}
