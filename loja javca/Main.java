import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota Corolla", 120000);
        Carro carro2 = new Carro("Honda Civic", 150000);
        Carro carro3 = new Carro("Ford Mustang", 350000);

        Cliente cliente = new Cliente("Gui", 50000);

        Concessionaria concessionaria = new Concessionaria();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à concessionária!");
        System.out.println("Carros disponíveis:");
        System.out.println("1. " + carro1);
        System.out.println("2. " + carro2);
        System.out.println("3. " + carro3);

        System.out.print("Escolha o número do carro que deseja comprar: ");
        int escolhaCarro = scanner.nextInt();

        Carro carroEscolhido;
        if (escolhaCarro == 1) {
            carroEscolhido = carro1;
        } else if (escolhaCarro == 2) {
            carroEscolhido = carro2;
        } else if (escolhaCarro == 3) {
            carroEscolhido = carro3;
        } else {
            System.out.println("Escolha inválida!");
            return;
        }

        System.out.print("Informe o valor que deseja pagar: ");
        double valorPago = scanner.nextDouble();

        if (valorPago < carroEscolhido.getPreco()) {
            System.out.print("Valor insuficiente! Deseja parcelar o restante? (Sim/Não): ");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("Sim")) {
                System.out.print("Em quantas parcelas (até 60x): ");
                int parcelas = scanner.nextInt();

                if (parcelas > 0 && parcelas <= 60) {
                    concessionaria.comprarCarro(cliente, carroEscolhido, valorPago, parcelas);
                } else {
                    System.out.println("Número de parcelas inválido!");
                }
            } else {
                System.out.println("Compra cancelada.");
            }
        } else {
            concessionaria.comprarCarro(cliente, carroEscolhido, valorPago, 0);
        }

        scanner.close();
    }
}
