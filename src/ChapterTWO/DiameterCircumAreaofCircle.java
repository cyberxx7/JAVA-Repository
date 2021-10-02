package ChapterTWO;

import java.util.Scanner;

public class DiameterCircumAreaofCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius;
        float pie = (float) 3.14159;
        float diameter;
        float circumfrence;
        float area;

        System.out.println("Enter the Radius of The Circle: ");
        radius = input.nextInt();


        diameter = 2 * radius;
        System.out.println("The Diameter of the Circle is " + diameter);

        circumfrence = 2 * pie * radius;
        System.out.println("The Circumference of the Circle is " + circumfrence);

        area = pie * radius * radius;
        System.out.println("The Area of the Circle is " + area);
    }
}
