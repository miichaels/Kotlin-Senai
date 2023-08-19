import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valor;

        String[] nome;
        float[][] nota;

        nome = new String[4];
        nota = new float[4][3];

        for (int x = 0; x <= 3; x++) {
            System.out.println("Digite um nome");
            nome[x] = scanner.next();

            for (int y = 0; y <= 2; y++) {
                System.out.println("Digite a nota");
                nota[x][y] = scanner.nextInt();
            }
        }

        for (int x = 0; x <= 3; x++) {
            System.out.println("Nome: " + nome[x]);

            for (int y = 0; y <= 2; y++) {
                System.out.println("Digite a nota" + nota[x][y]);
            }
        }


    }
}