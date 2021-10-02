package chapterThreeExercises;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count;
        int number;

        System.out.println("Enter A Number");
         number = input.nextInt();
        for ( count =2; count < number ; count++) {
            if (number % count == 0){
                System.out.println("This is not a Prime Number");
                break;

            }else{
                System.out.println("This is a Prime Number");
            }

        }


    }

}
