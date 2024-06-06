import java.util.Scanner;
 

public class Exer5 {
public static void main(String[] args) {
         
        double valor = 0;
         
        String exibirMenu;
        Scanner scanner = new Scanner(System.in);
       boolean sair = false;
        int codigoProduto,quantProduto;

        System.out.println(" Minha Lanchonete ");
        System.out.println("\nInsira o numero do código do seu pedido:");
    
        exibirMenu = """
                0- Sair
                1- Cachorro quente
                2- X-Salada 
                3- X-Bacon 
                4- Bauru 
                5- Refrigerante
                6- Suco De Laranja
                """;

            do{
            System.out.println(exibirMenu);
             codigoProduto = scanner.nextInt();

            switch (codigoProduto) {
                case 1:
                    System.out.println("Cachorroquente");
                    valor +=15.90;
                    break;
                case 2:
                    System.out.println("X-Salada");
                    valor+=15.00;
                break;
                case 3:
                    System.out.println("X-Bacon");
                    valor+=18.00;
                    break;
                case 4:
                    System.out.println("X-Bauru");
                    valor+=12.00;
                    break;
                case 5:
                System.out.println("Refrigerante ");
                    valor+=8.00;
                    break;
                case 6:
                System.out.println("Suco de laranja ");
                    valor+=13.00;
                    break;
                case 0:
                System.out.println("Obrgado volte sempre ");
                sair = true;
                break;
                default:
                break;
            }
                    
            }while(!sair); 
                
                
            
        
        System.out.printf("O total da sua compra foi:R$ %.2f",valor);
     
    }
} 
