import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");

        int a = userInput.nextInt();
        System.out.println("Podaj drugą liczbę.");
        int b = userInput.nextInt();
        System.out.println("Podaj trzecią liczbę.");
        int c = userInput.nextInt();

        int min = 0;
        int max = 0;

        if (a > b && a > c) {
            max = a;
        }
        else if (a < b && a < c) {
            min = a;
        }
        if (b > a && b > c) {
            max = b;
        } else if (b < a && b < c) {
            min = b;
        }
        if (c > a && c > b) {
            max = c;
        } else if (c < a && c < b) {
            max = c;
        }
        System.out.println("Największa liczba to: " + max);
        System.out.println("Najmniejsza liczba to: " + min);
    }
}

//możba też skorzystać z metody Math - SPRAWDŹ