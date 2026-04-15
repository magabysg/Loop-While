import java.util.Scanner;

public class Exx4 {

    void main() {
        Scanner sc = new Scanner(System.in);

        int secreto = 7;
        IO.println("\nDigite o número secreto:");
        int user = sc.nextInt();

        while (user != secreto) {
            IO.println("Número incorreto! Tente novamete.");
            user = sc.nextInt();
        }
        IO.println("Número descoberto!!\nProcesso finalizado!\n");
    }
}
