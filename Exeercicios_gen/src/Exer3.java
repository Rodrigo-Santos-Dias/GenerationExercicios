import java.util.Scanner;
public class Exer3 {
    public static void main(String[] args) {
        String nome;
        int idade,vezesDoadas;
        boolean primeiraDoacao =  false; 
        Scanner scanner   = new Scanner(System.in);

        System.out.println("\nDigite seu nome: ");
        nome = scanner.nextLine();

        System.out.println("\nDigite sua idade: ");
        idade = scanner.nextInt();
        if(idade<18 || idade > 69){
            System.out.println(nome+" não está apto a doar sangue");
        }else if (idade>=60 && idade<69 ) {
            System.out.println("\nQuantas vezes já doou sangue: ");
            vezesDoadas = scanner.nextInt();
           
            if(vezesDoadas>0){
                System.out.println(nome+"Está apto a doar sangue"); 
            } else if(!primeiraDoacao) {
                System.out.println(nome+" não está apto a doar sangue");
             }

        }else if (idade>=18 && idade <=59){
            System.out.println(nome+"Está apto a doar sangue");    
        } 
         
    }
}
