import java.util.Scanner;
public class Ex02 {

    void main(){

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        while (i >= 1){
            if (i%2 == 0) {
                IO.println("Numero par!");

            } else if (i%2 == 1){
                IO.println("Numero impar!");
            }
            i = sc.nextInt();
            IO.println("Processo finalizado!\n");
        }
    }
}
