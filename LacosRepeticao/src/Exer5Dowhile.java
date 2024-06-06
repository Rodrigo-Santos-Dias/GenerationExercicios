import java.util.Scanner;

public class Exer5Dowhile {
    public static void main(String[] args) {
    int num,somaNum = 0 ;
    Scanner scanner = new Scanner(System.in); 
        do{
            num = scanner.nextInt();
            if(num > 0){
                somaNum+=num;                
            }   

        }while(num != 0);
        System.out.println("A soma dos números positivos é: "+somaNum);
    }
}
