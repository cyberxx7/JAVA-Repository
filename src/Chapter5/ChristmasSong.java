package Chapter5;

public class ChristmasSong {



        public static void main(String[] args) {

            int number;
            String prize = "";
            String day = "";
            String song = "";
            System.out.print("");
            number = 12;
            System.out.println();

            for (int j = 1; j <= number; j++)
            {
                switch (j)
                {
                    case 1:
                        day = "First";
                        prize = "A Partridge in a Pear Tree \n ";
                        break;

                    case 2:
                        day = "Second";
                        prize = "\nTwo turtle doves, \nAnd " + prize;
                        break;

                    case 3:
                        day = "Third";
                        prize = "\nThree French Hens," + prize;
                        break;

                    case 4:
                        day = "Fourth";
                        prize = "\nFour Calling Birds," + prize;
                        break;

                    case 5:
                        day = "Fifth";
                        prize = "\nFive Golden Rings," + prize;
                        break;

                    case 6:
                        day = "Sixth";
                        prize = "\nSix Geese a Laying," + prize;
                        break;

                    case 7:
                        day = "Seventh";
                        prize = "\nSeven Swans a Swimming," + prize;
                        break;

                    case 8:
                        day = "Eighth";
                        prize = "\nEight Maids a Milking," + prize;
                        break;

                    case 9:
                        day = "Nineth";
                        prize = "\nNine Ladies Dancing," + prize;
                        break;

                    case 10:
                        day = "Tenth";
                        prize = "\nTen Lords a Leaping," + prize;
                        break;

                    case 11:
                        day = "Eleventh";
                        prize = "\nEleven Pipers Piping," + prize;
                        break;

                    case 12:
                        day = "Twelveth";
                        prize = "\n12 Drummers Drumming," + prize;
                        break;
                }

                song +="\nOn the " + day + " day of Christmas \nmy true love sent to me: " + prize;
            }
            System.out.println(song);
        }



    }

