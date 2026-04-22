import java.util.Scanner;

public class Exx7 {

    void main(){
        Scanner sc = new Scanner(System.in);

        int fatoraçao = 1;

        IO.println("\nDigite um número para saber o fatorial dele:");
        int numero = sc.nextInt();
        int contador = numero;

        while (contador > 1){
            fatoraçao *= contador;
            contador--;
        }
        IO.println("Fatoração do número digitado: " + (fatoraçao *= contador));
    }
}
