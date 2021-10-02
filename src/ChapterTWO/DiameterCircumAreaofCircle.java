package ChapterTWO;

import java.util.Scanner;

public class DiameterCircumAreaofCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius;
        float pie = (float) 3.14159;
        float diameter;
        float circumference;
        float area;

        System.out.println("Enter the Radius of The Circle: ");
        radius = input.nextInt();


        diameter = 2 * radius;
        System.out.println("The Diameter of the Circle is " + diameter);

        circumference = 2 * pie * radius;
        System.out.println("The Circumference of the Circle is " + circumference);

        area = pie * radius * radius;
        System.out.println("The Area of the Circle is " + area);
    }
}
