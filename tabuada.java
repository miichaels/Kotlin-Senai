import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número para a tabuada: ");
        int numero = scanner.nextInt();

        System.out.print("Digite o limite da tabuada: ");
        int limite = scanner.nextInt();

        for (int i = 1; i <= limite; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }

        scanner.close();
    }
}
