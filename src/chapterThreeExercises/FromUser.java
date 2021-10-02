package chapterThreeExercises;

import java.util.Scanner;

public class FromUser {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int counter;

        System.out.println("Please Enter The Number 20");
        counter= input.nextInt();


        while(counter >=1) {
        System.out.println(counter);
        counter--;

        }



    }

}
