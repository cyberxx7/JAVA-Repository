import java.util.Scanner;
public class TakeInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter A Number");
        int number= input.nextInt();
        switch (number){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                    System.out.println("TWO");
                    break;
            case 3:
                        System.out.println("THREE");
                        break;
            case 4:
                            System.out.println("FOUR");
                            break;
            case 5:
                                System.out.println("FIVE");
            case 6:
                System.out.println("Error In Application");
        }
    }
}
