import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        boolean done1 = false;

        while (!done1) {
            try {
                System.out.println("Podaj cenę towaru: ");
                float price = userInput.nextFloat();
                done1 = true;
            } catch (InputMismatchException exeption_1) {
                System.out.println("Proszę podaj prawidłową cenę");
            }
        }

            System.out.println("Podaj liczbę rat: ");
        int rates = userInput.nextInt();

        double interest = 0;
        double total = 0;
        double rateValue = 0;


        if (rates >= 6 && rates <= 12) {
            interest = price * 0.025;
        } else if (rates >= 13 && rates <= 24) {
            interest = price * 0.05;
        } else if (rates >= 25 && rates <= 48) {
            interest = price * 0.1;
        }

        total = price + interest;
        rateValue = total / rates;

        System.out.println("Cenat towaru: " + price + "zł");
        System.out.println("Liczba rat: " + rates);
        System.out.println();
        System.out.println("Odsetki: " + interest + "zł");
        System.out.println("Całkowity koszt: " + total + "zł");
        System.out.println("Wysokość jednej raty: " + rateValue + "zł");

    }
}

