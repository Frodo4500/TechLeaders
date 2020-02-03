import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        EqualsAndHashCode();
        TalkingMethodToString();
        PublicAndPrivateMetod();
        testPublicAndPrivateMetod();
    }

    static void EqualsAndHashCode() {
        cat cat1 = new cat("Феликс");
        cat cat2 = new cat("Феликс");
        cat cat3 = new cat("Морти");
        out.println("Сравнение имен котов " + cat1.getCatName() + " и " + cat2.getCatName() + " с помощью ==");
        out.println(cat1 == cat2);
        out.println("а теперь с помощью equals");
        out.println(cat1.equals(cat2));
        out.println("Добавим кота " + cat3.getCatName() + " и посмотрим хэш коды имен всех котов:");
        out.println(cat1.hashCode() + "  " + cat2.hashCode() + "  " + cat3.hashCode());
    }

    private static void TalkingMethodToString() {
        cat cat1 = new homeCat("Беляш");
        cat cat2 = new tiger("Арсений", 25);
        out.println("Узнаем о чем думает " + cat1.getCatName());
        out.println(cat1.toString());
        out.println("Узнаем о чем думает " + cat2.getCatName());
        out.println(cat2.toString());
    }

    private static void PublicAndPrivateMetod() {
        cat cat1 = new homeCat("Беляш");
        tiger cat2 = new tiger("Арсений", 25);
        out.println("Статус " + cat1.getCatName());
        cat1.getCatState();
        out.println("Погладили");
        cat1.touchCat();
        out.println("Статус " + cat1.getCatName());
        cat1.getCatState();

        out.println("Статус " + cat2.getCatName());
        cat2.getCatState();
        out.println("Он голоден на " + cat2.getLevelHungry() + " %");
        out.println("Погладили зверя");
        cat2.updateLevelHungry();
        cat2.getCatState();
        out.println("Он голоден на " + cat2.getLevelHungry() + " %");
        out.println("Погладили зверя снова");
        cat2.updateLevelHungry();
        cat2.getCatState();
    }

    private static void testPublicAndPrivateMetod() {
        whiteTiger cat = new whiteTiger("Bob", 12, 360);
        cat.say();
        out.println("Голоден " + cat.getLevelHungry() + " %");
        out.println("Весит " + cat.getAnimalWeight());
        out.println("Когда он поест, он гуляет " + cat.howMuchSleepThisCat() + " минут");
    }
}
