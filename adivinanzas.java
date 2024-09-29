import java.util.Random;
import java.util.Scanner;

public class adivinanzas {
    public static void main(String[] args) {
        int aleatorio = new Random().nextInt(50);
        Scanner teclado = new Scanner(System.in);
        int intentos = 0;


        while (intentos < 5) {

            System.out.println("Adivina el numero entre 1 /50: ");
            int intentosUs = teclado.nextInt();
            intentos++;

            if (aleatorio == intentosUs) {
                System.out.println("Felicidades adivinaste el numero !! ");
            } else if (aleatorio < intentosUs) {
                System.out.println("el numero que intentas adivinar es menor ");
            } else {
                System.out.println("el numero que intentas adividar es mayor");
            }
        }
        if (intentos == 5) {
            System.out.println("Lo siento, no conseguiste adivinar el número en 5 intentos. El número era " + aleatorio);
        }
    }
}
