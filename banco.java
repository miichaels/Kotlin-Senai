import java.util.Scanner;

public class banco {

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do usuário: ");
        String nome = scanner.next();

        System.out.println("Digite o salario do usuário: ");
        int salario = scanner.nextInt();

        System.out.println("O salario do(a) " + nome + " é de: R$" + salario);
        if (salario >= 1000){
            System.out.println("Você ganha bem");
        }else System.out.println(nome + " Você ganha pouco");

        scanner.close();
    }
}

