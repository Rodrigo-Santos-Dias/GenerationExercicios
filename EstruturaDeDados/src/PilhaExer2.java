import java.util.Scanner;
import java.util.Stack;

public class PilhaExer2 {

 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> pilhaDeLirvos = new Stack<>();
        String ExibirMenu = """
        **********************************************************************************
                1: Adicionar um novo livro à pilha.
                2: Listar todos os livros da pilha
                3: Remover o livro do topo da pilha
                0: Finalizar.
        **********************************************************************************
        Entre com a opção desejada:
                """;
        int opcao;
        boolean continuar = true;
        String livro;

        do {
            System.out.println("\n" + ExibirMenu);
            opcao = sc.nextInt();
            sc.nextLine();  

            switch (opcao) {
                case 1:
                    System.out.print("Digite o livro a ser adicionado: ");
                    livro = sc.nextLine();
                    pilhaDeLirvos.push(livro);
                    System.out.println("\nLivro \"" + livro + "\" adicionado à pilha.");
                    break;

                case 2:
                    if (pilhaDeLirvos.isEmpty()) {
                        System.out.println("Não há livros na pilha.");
                    } else {
                        System.out.println("livros na pilha:");
                        for (String s : pilhaDeLirvos) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 3:
                    if (pilhaDeLirvos.isEmpty()) {
                        System.out.println("A pilha está vazia.");
                    } else {
                        System.out.println("Removendo o livro do topo da pilha: " + pilhaDeLirvos.pop());
                    }
                    break;

                case 0:
                    System.out.println("\nFinalizando Programa.");
                    continuar = false;
                    break;

                default:
                    System.out.println("\nOpção inválida!!!");
            }
        } while (continuar);

        sc.close();
    }


}
