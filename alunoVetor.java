import java.util.Scanner;

public class alunoVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String num;

        String[] nome;
        nome = new String[5];

        for (int x = 0; x <= 4; x++){
            System.out.println("Digite um nome: ");
            num = scanner.next();
            nome[x] = num;
        }

        for (int x = 0; x <= 4; x++){
            System.out.println(nome[x] );
        }


    }
}
