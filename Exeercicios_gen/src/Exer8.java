import java.util.Scanner;

public class  Exer8 {
    public static void main(String[] args) {
        String nome;
        String cpf;
        int agencia;
        String conta;
        double saldo = 0;
        int sair = 1;
        String exibirMenu;
        Scanner scanner = new Scanner(System.in);

        System.out.println(" CONTA BANCÁRIA ");
        System.out.println("\nInsira o nome do titular:");
        nome = scanner.nextLine();

        System.out.println("\nInsira o CPF do titular:");
        cpf = scanner.nextLine();

        exibirMenu = """
                0- Sair
                1- Consultar Saldo
                2- Despositar
                3- Sacar
                """;

        do {
            System.out.println(exibirMenu);
            int opcoes = scanner.nextInt();

            if (opcoes == 1) {
                System.out.println("saldo");
            } else if (opcoes == 2) {
                double valorDeposito;
                valorDeposito = scanner.nextDouble();
                saldo = saldo += valorDeposito;
                System.out.println("depositar");
            } else if (opcoes == 3) {
                 
                System.out.println("sacar");
            } else if (opcoes == 0) {
                System.out.println(" ECERRANDO ");
                sair = 0;
            } else {
                System.out.println("Opcão inválida, digite alguma das opções indicadas");
            }

        } while (sair != 0);
    }

}