package ChapterTWO;

import java.util.Scanner;

public class ArithmeticSmallestAndLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int smallestNumber = 0;
        int largestNumber = 0;
        System.out.println("Enter First Number: ");
        firstNumber = input.nextInt();
        System.out.println("Enter Second Number: ");
        secondNumber = input.nextInt();
        System.out.println("Enter Third Number: ");
        thirdNumber = input.nextInt();

        int sum = (firstNumber + secondNumber + thirdNumber);
        System.out.println("The Sum is " + sum);

        int product = (firstNumber * secondNumber * thirdNumber);
        System.out.println("The Product is " + product);
        int average = (sum/3 );
        System.out.println("The Average is " + average);
      if(firstNumber > secondNumber){
          largestNumber = firstNumber;
          smallestNumber = secondNumber;
      }
        else{
            largestNumber = secondNumber;
            smallestNumber = firstNumber;
      }
        if(thirdNumber > largestNumber){
            largestNumber = thirdNumber;
        }
        if(thirdNumber < smallestNumber){
            smallestNumber = thirdNumber;
        }
            System.out.println("largest is: " + largestNumber);
            System.out.println("Smallest is: " + smallestNumber);
        }
    }
