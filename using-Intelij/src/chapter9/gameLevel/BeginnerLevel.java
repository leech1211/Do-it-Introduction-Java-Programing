package chapter9.gameLevel;

public class BeginnerLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("점프할줄 모름.");
    }

    @Override
    public void turn() {
        System.out.println("돌줄 모름.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("****** 초보자입니다. *****");
    }
}
