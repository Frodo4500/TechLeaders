import static java.lang.System.out;

public class tiger extends cat {
    protected int levelHungry = 20;

    public int getLevelHungry() {
        return levelHungry;
    }

    public tiger(String name, int levelHungry) {
        super(name);
        this.levelHungry = levelHungry;
    }

    protected void updateLevelHungry() {
        levelHungry += 30;
    }

    @Override
    public String toString() {
        return "'А ты прикольный, я съем тебя последним'";
    }

    @Override
    public boolean touchCat() {
        return !this.catState;
    }

    @Override
    public void getCatState() {
        out.println(levelHungry < 65 ? "Вы разбудили опасное животное, но успели сбежать" : "Вас съели =(");
    }
}