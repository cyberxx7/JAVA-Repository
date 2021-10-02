package ChapterFour;
import java.util.Scanner;
public class Passed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score;


        System.out.println("Please Enter A Number");
        score = input.nextInt();
        if (score <= 60) {
            System.out.println("D");
        } else {
            if (score <= 70) {
                System.out.println("C");
            } else {
                if (score <= 80) {
                    System.out.println("B");
                } else {
                    if (score <= 90) {
                        System.out.println("A");

                    }
                }
            }
        }
    }
}

