public class Triangle {
    public static void main(String[] args) {
        for (int counter = 1; counter < 6; counter++) {
            for (int counter2 = 1; counter2 <= counter; counter2++) {
                System.out.print("*");
            }


            System.out.println();
        }
        for (int counter = 1; counter < 6; counter++) {
            for (int counter2 = 5; counter2 >= counter; counter2--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }



