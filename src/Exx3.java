import java.util.Scanner;

public class Exx3 {

    void main(){
        Scanner sc = new Scanner(System.in);

        IO.println("Digite um numero:");
        int numero = sc.nextInt();
        int i = 0;
        int resultado = 1;

        while (resultado < 10){
            resultado = numero * i;
            i++;
            IO.println(resultado);
        }
    }
}
