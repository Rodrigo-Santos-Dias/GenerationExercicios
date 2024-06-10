import java.util.Queue;
import java.util.LinkedList; 
import java.util.Scanner;
 

public class FilaExer1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> filaDeClientes = new LinkedList<>();
        String ExibirMenu ="""
        **********************************************************************************
            1: Adicionar um novo Cliente na fila.
            2: Listar todos os Clientes na fila
            3: Chamar (retirar) uma pessoa da fila 
            0: Finalizar. 
        ***********************************************************************************
        Entre com a opção desejada:
                """;
        int opcao;
        boolean continuar = true;
        String nomeCliente;
        do{
            System.out.println("\n"+ExibirMenu);
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Digite seu nome: ");
                    nomeCliente = sc.nextLine();

                    filaDeClientes.add(nomeCliente);
                    System.out.println("\nCliente "+nomeCliente+ "adicionado a fila: ");
                    break;

                case 2:
                for (String cliente : filaDeClientes) {
                    System.out.println(cliente);
                }
                    break;
                case 3:
                    if(filaDeClientes.isEmpty()){
                        System.out.println("Sua fila está vazia");
                    }else{
                        System.out.println("Tirar cliente da fila :"+ filaDeClientes.peek());
                        filaDeClientes.poll();
                         
                    }
                    break;
                case 0:
                    System.out.println("\nFinalizando Programa: ");
                    continuar =false;
                    break;
                default:
                    System.out.println("\nopção inválida!!!");
            }
            
        }
        while(continuar);
        sc.close();
    }   
}
