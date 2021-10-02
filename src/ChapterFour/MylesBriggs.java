package ChapterFour;

import java.util.Arrays;
import java.util.Scanner;

public class MylesBriggs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String[][] questions = {{"A: expend, energy", "B: enjoy groups"},
                {"A: interpret, literally", "B: look for meaning and possibilities"},
                {"A: logical, thinking, questioning", "B: empathetic, feeling, accommodating"},
                {"A: organised, orderly", "B: flexible, adaptable"},
                {"A: more outgoing, think out loud", "B: more reserved, think to yourself"},
                {"A: practical, realistic, experiential", "B: imaginative, innovative, theoretical"},
                {"A: candid, straight forward, frank", "B: tactful, kind, encouraging,"},
                {"A: plan, schedule.", "B: unplanned, spontaneous"},
                {"A: seek many tasks, public activities, interaction with others.", "B: seek private, solitary activities with quiet to concentrate"},
                {"A: standard, usual, conventional.", "B: different, novel, unique"},
                {"A: firm, tend to criticise, hold the line.", "B. gentle, tend to to conciliate"},
                {"A: regulated, structured", "B: easygoing.\"live\" and let \"live\""},
                {"A: external, communicative, express yourself.", "B: internal, reticent, keep to yourself"},
                {"A: focus on here-and-now.", "B: look into the future, global perspective,\"big picture\""},
                {"A: preparation, plan ahead", "B: go with the flow, adapt as you go"},
                {"A: active initiate", "B: reflective, deliberate"},
                {"A: facts, things, \" what is\"", "B: ideas. dreams, \"what could be\", philosophical"},
                {"A: matter of fact, issue-oriented", "B: sensitive, people-oriented, compassionate"},
                {"A: control, govern.", "B: latitude, freedom"}};

        printAndCollectInput(input, questions);
    }

    private static void printAndCollectInput(Scanner input, String[][] questions) {
        String[] answers = new String[20];
        int count = 0;
        for (int row = 0; row < questions.length; row++) {
            for (int column = 0; column < questions[row].length; column++) {
                System.out.print(questions[row][column] + " ");

            }
            System.out.println();


            System.out.println("Enter an Option: ");
            String a = input.nextLine();
            answers[count] = a;
            count++;

            System.out.println();

            System.out.println(Arrays.toString(answers));


        }
    }
}
