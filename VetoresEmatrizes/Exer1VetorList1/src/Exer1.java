import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
        int vetor[]= {5, 12, 23, 34, 45, 56, 67, 78, 89, 90};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor que deseja encontrar: ");
        int numero  = scanner.nextInt();
        int posicao =  -1;
        boolean numEncontrado = false;
        for(int i= 0; i <vetor.length;i++ ){
            if(vetor[i]==numero){
                posicao = i;
                numEncontrado=true;
            }
        }if(numEncontrado){
            System.out.println("O número"+numero+"foi encontrado posição: "+posicao+" do vetor");
        }else{
            System.out.println("O número "+numero+" nãofoi encontrado na lista");
        }
    }
}