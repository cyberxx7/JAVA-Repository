package chapterThreeExercises;
import java.util.Scanner;
public class Kata {
    private int amount;

    public int calculatePricePerCopy(int i) {

        if (i >= 1 && i <= 4) {
            amount = i * 1500;
        }
        if (i >= 5 && i <= 9) {
            amount = i * 1400;

        }
        if (i >= 10 && i <= 29) {
            amount = i * 1200;

        }
        if (i >= 30 && i <= 49) {
            amount = i * 1100;

        }
        if (i >= 50 && i <= 99) {
            amount = i * 1000;
        }
        if (i >= 100 && i <= 199) {
           amount = i * 900;
        }
        if (i >= 200){
            amount = i * 800;
        }

return amount;
}
}