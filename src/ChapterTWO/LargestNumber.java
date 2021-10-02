package ChapterTWO;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber;
        int secondNumber;

        System.out.println("Enter First Number: ");
        firstNumber=input.nextInt();
        System.out.println("Enter Second Number: ");
        secondNumber = input.nextInt();

        if(firstNumber > secondNumber){
            System.out.println("FirstNumber is Larger than Second Number");
        }
        if(firstNumber< secondNumber){
            System.out.println("Second Number is Larger than First Number");
        }
        if(firstNumber == secondNumber){
            System.out.println("Both inputs are Equal");
        }
    }
}
