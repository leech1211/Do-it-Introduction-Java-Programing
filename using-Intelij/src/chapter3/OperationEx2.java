package chapter3;

public class OperationEx2 {
    public static void main(String[] args)
    {
        int gameScore = 150;
        int lasScore1 = ++gameScore;
        System.out.println(lasScore1);

        int lastScore2 = --gameScore;
        System.out.println(lastScore2);
    }
}
