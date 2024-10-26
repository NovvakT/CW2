import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args)  {
        System.out.println("Cześć, potrafię konwertować stopnie Celsjusza na stopnie Fahrenheita");

        Scanner userInput = new Scanner(System.in);
        System.out.print("Podaj temperaturę w stopniach Celsjusza: ");

        float number = userInput.nextFloat();
        float number_F = (9/5 * number + 32);

        System.out.println(number + " w stopniach Fahrenheita wynosi: " + number_F);
    }
}
