package ChapterTWO;

import java.util.Scanner;

public class LargestAndSmallestIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numb1;
        int number2;
        int number3;
        int number4;
        int number5;
        int largestNumber = 0;
        int smallestNumber = 0;
        System.out.println("Enter First Number: ");
        numb1 = input.nextInt();

        System.out.println("Enter First Number: ");
        number2 = input.nextInt();
        System.out.println("Enter First Number: ");
        number3 = input.nextInt();
        System.out.println("Enter First Number: ");
        number4 = input.nextInt();
        System.out.println("Enter First Number: ");
        number5 = input.nextInt();

        if(numb1 > number2){
            largestNumber = numb1;
            smallestNumber = number2;
        }else{
            largestNumber = number2;
            smallestNumber = numb1;
        }
        if(number3 > largestNumber){
            number3 = largestNumber;
        }
        if(number3 < smallestNumber){
            smallestNumber = number3;
        }
        if(number4 > largestNumber){
            largestNumber = number4;
        }
        if(number4 < smallestNumber){
          smallestNumber = number4;
        }
        if (number5 > largestNumber){
           largestNumber = number5;
        }
        if(number5 < smallestNumber){
            smallestNumber = number5;
        }
        System.out.println("The Largest Number is" + largestNumber);
        System.out.println("The Smallest Number is" + smallestNumber);

    }
}
