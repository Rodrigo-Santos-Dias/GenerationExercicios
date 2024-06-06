import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    int a,b,c,somaAeB;
    Scanner scanner   = new Scanner(System.in);
    System.out.println("\nEntre com o primeiro número: ");
    a = scanner.nextInt();

    System.out.println("\nEntre com o segundo número: ");
    b = scanner.nextInt();

    System.out.println("\nEntre com o terceiro número: ");
    c = scanner.nextInt();
    
    
    somaAeB = a + b; 
    
     
    if(somaAeB > c) {
    System.out.println("\nSoma de A com B é maior do que C");
    }else if(somaAeB < c ) {
    System.out.println("\nSoma de A com B é menor do que C");
    }else if (somaAeB == c) {
    System.out.println("\nSoma de A com B é menor do que C");
    }
    
    }

}
