import java.util.Scanner;

public class votar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if(idade < 16){
            System.out.println("Você ainda não vota.");
        }else if (idade >= 16 && idade<18 || idade>65){
            System.out.println("Seu voto é opcional");
        }else {
            System.out.println("Parabéns, você esta apto para votar!");
        }

    }
}
