package chapterThreeExercises;
import java.util.Scanner;
public class FromDown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter =1; //counter starts from 1
        int userInput;


        System.out.println("Enter a number");
        userInput = input.nextInt(); //e.g 12
        while (counter <= userInput) {
            System.out.println(counter);
            counter+=1;
        }
    }
}