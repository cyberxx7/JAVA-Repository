package chapterThreeExercises;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("Enter Number");
        number = input.nextInt();



        if(number < 10) {
            System.out.println("Input is less than 10");
        }else {
            if (number < 20) {
                System.out.println("Input is less than 20");
            } else {
                if (number < 30) {
                    System.out.println("Input is less that 30");
                } else {
                    if (number < 40) {
                        System.out.println("Input is less than 40");
                    } else {
                        if (number < 50) {
                            System.out.println("Input is less than 50");
                        } else {
                            if (number < 60) {
                                System.out.println("Input is less than 60");
                            } else {
                                if (number < 70) {
                                    System.out.println("Input is less than 70");
                                } else {
                                    if (number < 80) {
                                        System.out.println("Input is less than 80");
                                    } else {
                                        if (number < 90) {
                                            System.out.println("Input is less than 90");
                                        } else {
                                            if (number < 100) {
                                                System.out.println("Input is less than 100");
                                            } else {
                                                if (number > 100){
                                                    System.out.println("Input is greater than 100");
                                                }
                                            }
                                        }

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}
