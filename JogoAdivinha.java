import java.util.Random;
import java.util.Scanner;
public class JogoAdivinha {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String comparacao = "";
        int numeroTentativas = 0;
        int numeroGerado = new Random().nextInt(10);

        for (int i = 0; i < 5; i++) {
            System.out.println("Adivinhe o número de 0 a 10!");

            int numeroInserido = leitura.nextInt();
            numeroTentativas++;

            if (numeroInserido == numeroGerado) {
                System.out.println("Parabéns, você acertou o número! :D");
                break;
            } else if (numeroInserido > numeroGerado) {
                comparacao = "maior";
            } else {
                comparacao = "menor";
            }

            System.out.println("Que pena, você errou." +
                    " Mas o número que você inseriu é " + comparacao + " do que o numero gerado.");
            if (numeroTentativas < 5) {
                System.out.println("Ainda restam " + (5 - numeroTentativas) + " tentativas. Tente novamente!");

            } else {
                System.out.println("As suas tentativas acabaram. :(");
                System.out.println("O número correto era " + numeroGerado);
            }
        }

    }

}
