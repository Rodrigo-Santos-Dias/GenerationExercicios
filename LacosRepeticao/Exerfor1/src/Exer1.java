import java.util.Scanner;
public class Exer1 {
    public static void main(String[] args) {
        int x,num,quantImpar=0,quantPar = 0;    
        Scanner scanner = new Scanner(System.in);
        for(x=1;x<=10;x++){
            System.out.println("Digite um numero");
            num = scanner.nextInt();
            if(num % 2 == 0){
                quantPar+=1;                    
            }else{
                quantImpar+=1;
            }
        }

        System.out.println("A quantidade de numeros pares foi:"+quantPar);
        System.out.println("A quantidade de numeros ípares foi:"+quantImpar);

    }    
}

