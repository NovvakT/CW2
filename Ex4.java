import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        System.out.println("Cześć, jestem kalkulatorem obsługującym dodawanie, odejmowanie, mnożenie, dzielenie");

        Scanner userInput = new Scanner(System.in);
        System.out.println("Proszę podaj pierwszą liczbę: ");
        int a = userInput.nextInt();
        System.out.println("Proszę podaj znak operacji (+, -, *, /)");
        String sign = userInput.next();
        System.out.println("Proszę podaj drugą liczbę: ");
        int b = userInput.nextInt();
        userInput.close();

        float result;

        switch (sign) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
        }

        }

        System.out.println("Wynik to: " + result);
    }

}
// dokończyc warunke z dzieleniem przez 0 i dodać default dot. błędnej operacji
