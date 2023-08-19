import java.util.Scanner;

public class criancaEsperanca {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        int opcao;
        float valor = 0;
        float soma = 0;


        do {




            System.out.println("Escolha o numero de 1 a 5");
            System.out.println("1 para doar  10$");
            System.out.println("2 para doar  25$");
            System.out.println("3 para doar  50$");
            System.out.println("4 para doar outro valor $");
            System.out.println("5 para cancelar");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    valor = 10;
                    break;

                case 2:
                    valor = 25;
                    break;

                case 3:
                    valor = 50;
                    break;

                case 4:
                    System.out.println("Digite o valor que deseja doar");
                    valor = scanner.nextInt();
                    break;

                case 5:
                    System.out.println("Que pena, ligue novamente para faer uma doação");
                    break;

                default:
                    System.out.println("Numero invalido, digite o numero de 1 a 5.");
            }
           if (opcao != 5){
               soma += valor;
           }

        } while(opcao != 5);
        System.out.println("Valor doado foi de: " + soma);
    }


}
