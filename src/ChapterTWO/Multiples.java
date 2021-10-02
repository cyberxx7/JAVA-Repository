package ChapterTWO;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numb1;
        int number2;
        System.out.println("Enter First Number: ");
        numb1 = input.nextInt();
        System.out.println("Enter Second Number: ");
        number2 = input.nextInt();
        if (number2 % numb1 == 0) {

            System.out.println(numb1 + " is A " + "Multiple of " + number2);
        }
        if (number2 % numb1 >= 1 ) {
            System.out.println(numb1 + " is NOT a " + "Multiple of " + number2);
        }
    }
}