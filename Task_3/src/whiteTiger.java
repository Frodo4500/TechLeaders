public class whiteTiger extends tiger {
    public int animalWeight = 0;

    public whiteTiger(String name, int levelHungry, int animalWeight) {
        super(name, levelHungry);
        this.animalWeight = animalWeight;
    }

    public double howMuchSleepThisCat() {
        return (this.animalWeight / this.levelHungry);
    }

    public int getAnimalWeight() {
        return animalWeight;
    }

    @Override
    protected void updateLevelHungry() {
        super.updateLevelHungry();
        this.levelHungry += 2;
    }

    @Override
    public String toString() {
        return "Редкий, красивый тигр";
    }
}
