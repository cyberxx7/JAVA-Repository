package ChapterTWO;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weightInkilo ;
        double heightInMeters;
        double BMI;

        System.out.println("Enter Weight in Kilograms");
        weightInkilo = input.nextDouble();
        System.out.println("Enter Height in Meters");
        heightInMeters=input.nextDouble();
        BMI= (int) (weightInkilo  / heightInMeters * heightInMeters);
        System.out.println("Your BMI is " + BMI);

        System.out.println("""
                BMI Values:
                Underweight: Less than 18.5
                Normal:      Between 18.5 and 24.9
                Overweight   Between 25 and 29.9
                Obese        30 or Greater
                """);
    }
}
