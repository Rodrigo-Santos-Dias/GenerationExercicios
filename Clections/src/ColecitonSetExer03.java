import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;
public class ColecitonSetExer03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> setNumInt = new HashSet<>();
        Integer numero;
         

      

        for (int i = 1; i < 10; i++) {
            System.out.print("\nDigite o " + (i) + "º número: ");
            numero = sc.nextInt();
            if (setNumInt.contains(numero)){
                System.out.println("Número ja digitado digite outro por favor:");
                i=(i-1);
                Iterator<Integer> iterator = setNumInt.iterator();
                    while (iterator.hasNext()) {
                    System.out.println("\n"+iterator.next());
                    }     
            }else{ 
                System.out.println("Número adicionado com suscesso!!!");
                setNumInt.add(numero);
                   
                } 
                         
             
        }
        System.out.println("\tElementos do set:");
        Iterator<Integer> iterator = setNumInt.iterator();
        while (iterator.hasNext()) {
        System.out.println(iterator.next());
        }     
    }
        
}
