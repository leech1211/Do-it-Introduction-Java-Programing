package chapter9.gameLevel;

public class Player {
    private PlayerLevel level;   //플레이어가 가지는 level

    public Player(){
        level = new BeginnerLevel();    //시작하면 beginner로
        level.showLevelMessage();       //레벨 출력
    }

    public PlayerLevel getLevel(){
        return level;
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int count) {
        level.go(count);
    }
}
