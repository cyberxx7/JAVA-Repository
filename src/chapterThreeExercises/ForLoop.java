package chapterThreeExercises;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.println("Enter a number");
        number = input.nextInt();


        for (int count = 2; count <= 10 ; count = count+2) {
            System.out.println(count);
        }
    }

}
