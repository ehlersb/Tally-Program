import java.util.Comparator;

/**
 * Created by Benjamin Ehlers on 12/24/2018.
 */
public class ScoreLetter implements Comparable<ScoreLetter>{
    private int score;
    private char letter;

    public ScoreLetter(int score, char letter) {
        this.score = score;
        this.letter = letter;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    @Override
    public int compareTo(ScoreLetter s1) {
        return this.score - s1.getScore();

    }
}
