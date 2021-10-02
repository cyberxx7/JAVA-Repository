package chapterThreeExercises;

import java.util.Scanner;

public class printNoneUser {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int firstNumber;
            System.out.println("Enter A Number");
            firstNumber = input.nextInt();

            for (int counter = firstNumber; counter >= 1 ; counter--) {
                System.out.println(counter);
            }

        }



}
