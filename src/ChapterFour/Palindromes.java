package ChapterFour;
import java.util.Scanner;
public class Palindromes {
    public static void main(String[] args) {

        int x,number;
        int y=0;
        int temp=0;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter any number: ");
        number=input.nextInt();
        x=number;
        while(number>0)
        {
            x=number%10;
            number=number/10;
            temp=temp*10+x;
        }
        if(temp==y)
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("not Palindrome");
        }

    }
}
