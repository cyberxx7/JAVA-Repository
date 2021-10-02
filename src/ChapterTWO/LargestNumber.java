package ChapterTWO;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNum;
        int secondNumber;

        System.out.println("Enter First Number: ");
        firstNum=input.nextInt();
        System.out.println("Enter Second Number: ");
        secondNumber = input.nextInt();

        if(firstNum > secondNumber){
            System.out.println("FirstNumber is Larger than Second Number");
        }
        if(firstNum< secondNumber){
            System.out.println("Second Number is Larger than First Number");
        }
        if(firstNum == secondNumber){
            System.out.println("Both inputs are Equal");
        }
    }
}
