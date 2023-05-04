import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String comparacao;

        for(int i = 0; i < 5; i++){
            System.out.println("Adivinhe o número!");
            int numeroGerado = new Random().nextInt(100);
            int numeroInserido = leitura.nextInt();

            if(numeroInserido == numeroGerado){
                System.out.println("Parabéns, você acertou o número! :D");
                break;
            }else{
                if(numeroInserido > numeroGerado){
                    comparacao = "maior";
                }else{
                    if(numeroInserido < numeroGerado){
                        comparacao = "menor";
                    }
                }

                System.out.println("Que pena, você errou." +
                        " Mas o número que você inseriu é " + comparacao + " do que o numero gerado." +
                        " Ainda restam" + numeroTentativas + " tentativas. Tente novamente!");
            }

        }
    }
}
