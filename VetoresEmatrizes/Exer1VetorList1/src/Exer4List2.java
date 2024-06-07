import java.util.Scanner;

public class Exer4List2 {
      public static void main(String[] args) {
         
        int NUM_PARTICIPANTES = 10;
        int NUM_BIMESTRES = 4;
        
        
        double[][] notas = new double[NUM_PARTICIPANTES][NUM_BIMESTRES];
        
        // Vetor para armazenar as médias dos participantes
        double[] medias = new double[NUM_PARTICIPANTES];
        
        Scanner scanner = new Scanner(System.in);
        
        // Leitura das notas dos participantes
        for (int i = 0; i < NUM_PARTICIPANTES; i++) {
            System.out.println("Digite as notas do participante " + (i + 1) + ":");
            double soma = 0;
            for (int j = 0; j < NUM_BIMESTRES; j++) {
                System.out.print("Nota do " + (j + 1) + "º bimestre: ");
                notas[i][j] = scanner.nextDouble();
                soma += notas[i][j];
            }
            
            medias[i] = soma / NUM_BIMESTRES;
        }
        
        
        System.out.println("\nMédias dos participantes:");
        for (int i = 0; i < NUM_PARTICIPANTES; i++) {
            System.out.println("Participante " + (i + 1) + ": " + medias[i]);
        }
        
       
        scanner.close();
    }
}
