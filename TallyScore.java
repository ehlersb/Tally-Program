import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Benjamin Ehlers on 12/24/2018.
 */
public class TallyScore {

    public static void main(String[] args) {
        char[] input = args[0].toCharArray();

        int pointsA = 0;
        int pointsB = 0;
        int pointsC = 0;
        int pointsD = 0;
        int pointsE = 0;

        for(char c : input) {
            switch(c) {
                case 'a':
                    pointsA++;
                    break;
                case 'A':
                    pointsA--;
                    break;
                case 'b':
                    pointsB++;
                    break;
                case 'B':
                    pointsB--;
                    break;
                case 'c':
                    pointsC++;
                    break;
                case 'C':
                    pointsC--;
                    break;
                case 'd':
                    pointsD++;
                    break;
                case 'D':
                    pointsD--;
                    break;
                case 'e':
                    pointsE++;
                    break;
                case 'E':
                    pointsE--;
                    break;
                default:
                    System.out.println("Bad input");
            }
        }

        ArrayList<ScoreLetter> scoreLetterArrayList = new ArrayList<>();

        scoreLetterArrayList.add(new ScoreLetter(pointsA, 'a'));
        scoreLetterArrayList.add(new ScoreLetter(pointsB, 'b'));
        scoreLetterArrayList.add(new ScoreLetter(pointsC, 'c'));
        scoreLetterArrayList.add(new ScoreLetter(pointsD, 'd'));
        scoreLetterArrayList.add(new ScoreLetter(pointsE, 'e'));

        Collections.sort(scoreLetterArrayList);
        Collections.reverse(scoreLetterArrayList);

        for(int i = 0; i < scoreLetterArrayList.size() - 1; i++) {
            char letter = scoreLetterArrayList.get(i).getLetter();
            int curScore = scoreLetterArrayList.get(i).getScore();
            int scoreLength = (curScore + "").length();
            System.out.format(letter+":%"+scoreLength+"d, ", curScore);
        }
        char letter = scoreLetterArrayList.get(4).getLetter();
        int score = scoreLetterArrayList.get(4).getScore();
        int scoreLength = (score + "").length();
        System.out.format(letter+":%"+scoreLength+"d", score);
    }

}

