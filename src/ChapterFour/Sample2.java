package ChapterFour;

public class Sample2 {
    public static void main(String[] args) {
        int[] evenNumbers = {10, 5, 2, 7, 89,76, 60};
       Sample2 sample2 = new Sample2();
       sample2.printEvenNumbers(evenNumbers);
    }


    public void printEvenNumbers(int[] evenNumbers){
        for (int i = 0; i < evenNumbers.length ; i++) {
            if(evenNumbers[i] % 2 == 0)
                System.out.println(evenNumbers[i]);
        }
    }
}
