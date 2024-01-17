import java.util.Scanner;

public class contaBancoCurso1 {
    public static void main(String[] args) {
        System.out.println("Bem-Vindo a conta Gicobank");
        String nome ="Giovani Fernades MAchado";
        double saldo = 2000;
        Scanner leitura = new Scanner(System.in);
        int opcao= 0;


        String menu = """
                *** Digite Sua Opção***
                1- Fazer Pix
                2- Receber Pix
                3- Consulta de saldo
                4- Sair
                """;

        while (opcao !=4) {
            System.out.println(menu + "Digite sua opção");
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Qual o valor que será transferido?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo -= valor;
                    System.out.println("Saldo atualizado, valor atual de: " + saldo);
                }
            } else if (opcao == 2) {
                System.out.println("Qual valor a ser recebido?");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Valor atual: " + saldo);
            } else if (opcao == 3) {
                System.out.println(" O saldo da sua conta é: " + saldo);
            } else if (opcao == 4) {
                System.out.println(" Fianlizando operações ");
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}
