import java.util.Scanner;
public class Exer4 {
    public static void main(String[] args) {
        String palavra1,palavra2,palavra3;
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("\nEntre com a primeira palavra");
        palavra1 = scanner.nextLine();
        System.out.println("\nEntre com a segunda  palavra");
        palavra2 = scanner.nextLine();
        System.out.println("\nEntre com a terceira palavra");
        palavra3 = scanner.nextLine();

        if(palavra1.equalsIgnoreCase("vertebrado")){
            if(palavra2.equalsIgnoreCase("ave")){
               if (palavra3.equalsIgnoreCase("carnivoro")) {
                System.out.println("\nÉ uma Aguía");
               }else{
                System.out.println("\nÉ uma pomba");
               }     
            } else{
                if (palavra3.equalsIgnoreCase("carnivoro")){
                    System.out.println("\nÉ uma vaca");
                } else{
                    System.out.println("\nÉ Humano");
                }     
            }
        
        }else{
            if(palavra2.equalsIgnoreCase("inseto")){
                if (palavra3.equalsIgnoreCase("hematofago")) {
                 System.out.println("\nÉ uma pulga");
                }else{
                 System.out.println("\nÉ uma lagarta");
                }     
             } else{
                 if (palavra3.equalsIgnoreCase("Hematofago")){
                     System.out.println("\nÉ uma sanguesuga");
                 } else{
                     System.out.println("\nÉ minhoca");
                 }     
             }
        }
        scanner.close();
    }
   
}
