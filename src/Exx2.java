import java.util.Scanner;

public class Exx2 {

    void main() {
        Scanner sc = new Scanner(System.in);

        IO.println("\nDigite um numero;");
        int numero = sc.nextInt();
        int i = 1;
        int resultado = 0;

        while (numero >= i) {
            resultado = resultado + i;
            i++;

        }
        IO.println(resultado);
    }
}
