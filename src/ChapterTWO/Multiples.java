package ChapterTWO;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        System.out.println("Enter First Number: ");
        number1 = input.nextInt();
        System.out.println("Enter Second Number: ");
        number2 = input.nextInt();
        if (number2 % number1 == 0) {

            System.out.println(number1 + " is A " + "Multiple of " + number2);
        }
        if (number2 % number1 >= 1 ) {
            System.out.println(number1 + " is NOT a " + "Multiple of " + number2);
        }
    }
}