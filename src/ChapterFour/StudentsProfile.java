package ChapterFour;
import java.util.Scanner;
public class StudentsProfile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStudents;
        int numberOfSubjects;

        System.out.println("Enter Number of Students");
        numberOfStudents = input.nextInt();
        System.out.println("Enter Number of Subjects");
        numberOfSubjects = input.nextInt();
        int[][] subjectScores = new int [numberOfStudents][numberOfSubjects];

        for (int i = 0; i < subjectScores.length; i++) {
            System.out.println("Enter scores: " + (i + 1));
        subjectScores[0][i] = input.nextInt();
            System.out.println(subjectScores[i]);
        }
    }
}