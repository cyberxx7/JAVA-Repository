package ChapterFour;
import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.println("Put in your score ");
        printGrade(input.nextInt());
    }
    public static void printGrade(int score) {
        if (score >= 90) {
            System.out.println("Your Grade is A");
        } else if (score >= 80) {
            System.out.println("Your Grade is B");

        } else if (score >= 70) {
            System.out.println("Your Grade is C");
        }
        else if (score >= 60) {
            System.out.println("Your Grade is D");
        }
        else {
            System.out.println("Your Grade is F");
        }
}
}