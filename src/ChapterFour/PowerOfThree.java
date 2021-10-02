package ChapterFour;

import java.util.Scanner;

public class PowerOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 100;

        System.out.println("Please Enter First Number");
        number = input.nextInt();
                while(number <= 100) {
                    System.out.println(number);
                    number--;
                }
                }
}
