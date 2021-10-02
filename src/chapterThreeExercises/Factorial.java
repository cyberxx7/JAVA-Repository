package chapterThreeExercises;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count;
        int number;
        System.out.println("Enter A Number");
        number= input.nextInt();
        for ( count = 1; count <number; count++) {
           if(number % count == 0){
               System.out.println(count);
           }

        }


    }
}
