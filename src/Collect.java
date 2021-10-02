import java.util.Scanner;

public class Collect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minimum = 1000000000;
        int maximum = 0 ;
        int total = 0;
        int average ;
        int[] inputs = new int[10];
        for (int i = 0; i < 10; i++) {
           int userResponse=input.nextInt();
            inputs[i] = userResponse;
            total = total + userResponse;

            if (userResponse > maximum)
                    maximum = userResponse;
            if (userResponse < minimum)
                minimum = userResponse;

        }
        average = total / 10;
        System.out.println(maximum);
        System.out.println(minimum);
        System.out.println(total);
        System.out.println(average);







    }
}
