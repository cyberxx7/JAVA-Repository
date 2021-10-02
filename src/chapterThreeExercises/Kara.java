package chapterThreeExercises;

public class Kara {
    int amount;
    public int pricePerCopies(int i) {

        if(i >= 1 && i <5){
            amount = i * 1500;
        }
        return amount;
    }
}
