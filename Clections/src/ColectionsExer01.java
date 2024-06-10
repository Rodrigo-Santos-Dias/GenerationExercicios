import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ColectionsExer01 {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cor;
        ArrayList<String> listaDeCores = new ArrayList<>();
        for(int i=0;i<=3;i++){
            System.out.println("Digite a "+(i+1)+"ªcor:");
            cor  = sc.nextLine();
            listaDeCores.add(cor);
        }
        Collections.sort(listaDeCores);
        System.out.println("Lista de cores ordenada:");
        for (String corOrdenada : listaDeCores) {
            System.out.print("\t"+corOrdenada);
        }
    }     
}
