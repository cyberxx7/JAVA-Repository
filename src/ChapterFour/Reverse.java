package ChapterFour;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("Enter Your Name");
        name = input.nextLine();

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i) + " ");
        }


    }
}








