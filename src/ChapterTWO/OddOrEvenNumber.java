package ChapterTWO;

import java.util.Scanner;

public class OddOrEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter A number: ");
        number = input.nextInt();
        if(number % 2 == 0){
            System.out.println(number + " Is an Even Number");
        }
        if(number % 2 > 0){
            System.out.println(number + " Is and Odd Number");
        }

    }
}
