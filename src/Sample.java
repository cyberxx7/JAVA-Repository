public class Sample {
    public static void main(String[] args) {
        int[] number = new int[12];
        //for (int i = 0; i < number.length; i++) {
         //   System.out.println(number[i]);
       // for (int num : number){
        //System.out.println(num);
         String[][] scores = {
               {"Ayo", "Tife"},
                {"fff", "yuioi"},
               {"Jide", "gdhdj"},
                {"gdgdh", "gdhdh"},
               {"fgdg", "sgshsh"}
       };
        for (int row = 0; row < scores.length; row++) {
            System.out.println();
            for (int column = 0; column < scores[row].length; column++) {
                System.out.println(scores[row][column] + " ");
            }

        }

       // String[][] numbers = {{"2", "5", "8"}, {"7", "9", "4"}, {"3", "7", "7"}, {"5", "2", "9"}, {"8", "1", "5"}};
      //  for (int row = 0; row < numbers.length; row++) {
        //    System.out.println();
         //   for (int column = 0; column < numbers[row].length ; column++) {
            //    System.out.print(numbers[row][column] + " ");

          //  }


        }
    }


//    }




//}
