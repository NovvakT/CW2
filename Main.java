public class Main {
    public static void main(String[] args) {
    }
}
        //System.out.println("Hello World");
//
//        int number;
//
//        number = 3;
//        number +=10;
//        number -= 5;
//        number *= 8;
//        number /= 4;
//        int second_number = number % 2;
//
//        float float_number = number / 7f;
//
//// operatory logiczne
//// ==
//// !=
//// >=
//// <=
//// && - and
//// || - or (znak nazywa się pipe)
//// ! - negacja
//
//        boolean l_1 = true;
//        boolean l_2 = false;
//
//        boolean test_1 = l_1 || l_1;
//        boolean test_2 = l_1 || l_2;
//        boolean test_3 = l_2 || l_2;
//        boolean test_4 = l_2 || l_1;
//
//        //System.out.println(number);
//        //System.out.println(second_number);
//        //System.out.println(float_number);
//        //System.out.println(test_1);
//        //System.out.println(test_2);
//        //System.out.println(test_3);
//        //System.out.println(test_4);
//
//        //niejawna konwersja, np. int na string przy konkatenacji
//        boolean result = number > float_number;
//        //System.out.println(result);
//        //System.out.println("Liczba " + number + " jest większa niż" + float_number);
//
//        int input_number = 7;
//        int test_number = 15;
//
//        if (input_number > test_number) {
//            System.out.println("Liczba " + input_number + " jest większa niż " + test_number);
//        } else if (input_number == test_number) {
//            System.out.println("Liczba " + input_number + " jest równa liczbie " + test_number);
//        } else {
////            System.out.println("Liczba " + input_number + " jest mniejsza niż " + test_number);
//        }
//
////        for (int i = 1; i < 11; i++) {
////            System.out.print(i + " ");
////        }
////
////        for (int i = 1; i <= 10; i++) {
////            System.out.print(i + " ");
////        }
////
////        for (int i = 0; i < 10; i++) {
////            System.out.print((i+1) + " ");
////        }
//
//        int i = 0;
//        while (i < 10) {
//            System.out.println(i + " ");
//            ++i;
//        }
//
//
//    }
//}
//
//
//// rzutowanie (casting)
////
//// w3schools.com
////
//// switch - podobne do if, ale działa na liczby (UWAGA - w switch jest też default, a nie boolean

//import.java.util.Scanner;
//
//public class APP{
//    public static void main(String[] args)
//    Scanner input = new Scanner(System.in);
//                System.out.print("Podaj liczbę: ");
//    int number = input.nextInt();
//
//    final int CONDITION_NUMBER = 10;
//
//                if (number > 10) {
//        System.out.println("Liczba jest większa niż " + CONDITION_NUMBER);
//    } else if (number < 10) {
//        System.out.println("Liczba jest mniejsza od " + CONDITION_NUMBER);
//    } else {
//        System.out.println("Liczba jest równa 10");
//    }