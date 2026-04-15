import java.util.Scanner;

public class Exx6 {

    void main() {
        Scanner sc = new Scanner(System.in);

        double nota = 0;
        double soma = 0;
        int contador = 0;

        while (nota != -1) {
            IO.println("Digite as notas:");
            nota = sc.nextInt();

            if (nota != -1){
                contador++;
                soma += nota;
            }
        }
        IO.println(soma / contador);
    }
}