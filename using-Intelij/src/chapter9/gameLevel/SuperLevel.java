package chapter9.gameLevel;

public class SuperLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("높이 뜁니다.");
    }

    @Override
    public void turn() {
        System.out.println("한바퀴 돕니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("****** 유단자 입니다. *****");
    }

}
