package chapterThreeExercises;

public class TrianglePrinting2 {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
