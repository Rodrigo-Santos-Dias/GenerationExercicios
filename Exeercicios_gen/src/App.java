     
import java.util.Scanner;

 

public static void main(String[] args) {
// TODO Auto-generated method stub

int op;

Scanner leia = new Scanner(System.in);

System.out.println("\n\t\tMenu de elogios");
System.out.println("\n1- Empáticos");
System.out.println("\n2- Incríveis");
System.out.println("\n3- Galera Bonita");
System.out.println("\n4- São FOFOS");
System.out.println("\nPor favor, digite a opção do elogio: ");
op = leia.nextInt();//1

switch(op) {
case 1:
System.out.println("\nEmpáticos");
if(op==1) {
System.out.println("\nAlém de empáticos são muito comunicativos");
}
break;
case 2:
System.out.println("\nIncríveis");
break;
case 3:
System.out.println("\nGalera Bonita");
break;
case 4:
System.out.println("\nSão FOFOS");
break;
default:
System.out.println("\nOpção Inválida!!!");
}
}
// casos if 
public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    float n1,n2,n3,media;
    String nome;
    int rm;
    
    Scanner leia = new Scanner(System.in);
    System.out.println("\nEntre com o seu nome: ");
    nome = leia.nextLine();
    System.out.println("\nQual é o seu RM (registro de matrícula): ");
    rm = leia.nextInt();
    System.out.println("\nEntre com a primeira nota: ");
    n1 = leia.nextFloat();
    System.out.println("\nEntre com a segunda nota: ");
    n2 = leia.nextFloat();
    System.out.println("\nEntre com a terceira nota: ");
    n3 = leia.nextFloat();
    
    media = (n1+n2+n3) / 3;
    System.out.printf("\nNome do participante: %s \t Código: %d",nome,rm);
    System.out.printf("\nMédia final foi de: %.2f e a primeira nota foi: %f",media,n1);
    System.out.println("\nMédia final foi de: "+media+" e a primeira nota foi: "+n1);
    //media = 8.75 6.5 4.5
    if(media>=7 && media<=10) {
    System.out.println("\nAlune Aprovade!!!");
    }else if(media>=5 && media<7) {
    System.out.println("\nAlune de Exame!!!");
    }else {
    System.out.println("\nAlune Reprovade!!!");
    }
    
    }


 
 
