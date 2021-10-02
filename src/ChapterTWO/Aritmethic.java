package ChapterTWO;

import java.util.Scanner;

public class Aritmethic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int sum;
        int quotient;
        int difference;
        int product;

        System.out.println("Enter First Number Number: " );
        firstNumber = input.nextInt();
        System.out.println("Enter Second Number: " );
        secondNumber = input.nextInt();

        sum = (firstNumber + secondNumber);
        System.out.println("The Sum is" + sum);

        quotient = (firstNumber/secondNumber);
        System.out.println("The Quotient is " + quotient);

        difference= (firstNumber - secondNumber);
        System.out.println("The Difference is " + difference);

        product = (firstNumber * secondNumber);
        System.out.println("The Product is " + product);

    }
}
