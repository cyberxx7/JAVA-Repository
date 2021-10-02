package ChapterFour;

import java.util.Arrays;
import java.util.Scanner;

public class TacticToe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row;
        int column;
        int value;

        String[][] position = new String[3][3];


        while(true) {
            System.out.println(" Player One Enter A Position");
            int player1 = input.nextInt();
            value = player1 - 1;
            row = value / 3;
            column = value % 3;
            position[row][column] = "X";
            displayBoard(position);

            System.out.println(" Player Two Enter A Position");
            int player2 = input.nextInt();
            value = player2 - 1;
            row = value / 3;
            column = value % 3;
            position[row][column] = "O";
            displayBoard(position);

            if(position == null){



            }
        }




    }

    private static String[][] displayBoard(String[][] array){
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.printf("%-5s", array[row][column] + " ");
            }
            System.out.println();
            System.out.println();
            System.out.println();
        }
        return array;
    }

}
