import java.util.Scanner;

public class Exer2 {
     public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    int numero;
    Scanner scanner   = new Scanner(System.in);
    System.out.println("\nEntre com o primeiro número: ");
    numero = scanner.nextInt();

     
     
    if(numero % 2 == 0) {
    System.out.print("O número"+numero+"é par");
    if (numero >0 ) {  // If aninhado
        System.out.print("e positivo");
    }else if(numero < 0 ) {
        System.out.println("e negativo");  
        }
    }else if(numero % 2 > 0 ) {
        System.out.print("O número"+numero+"é ímpar");
        if (numero >0 ) {  // If aninhado
            System.out.print("e positivo");
        }else if(numero < 0 ) {
            System.out.println("e negativo");  
            }
    }
}
}