package ChapterTWO;

import java.util.Scanner;

public class OddOrEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter A num: ");
        num = input.nextInt();
        if(num % 2 == 0){
            System.out.println(num + " Is an Even Number");
        }
        if(num % 2 > 0){
            System.out.println(num + " Is and Odd Number");
        }

    }
}
