import java.util.Objects;
import static java.lang.System.out;

public class cat {

    public static final String CAT_MESSAGE = "Моего питомца зовут %s";
    private String name;
    protected boolean catState = false;

    public void say() {
        out.println(String.format(CAT_MESSAGE, name));
    }

    public cat(String name) {
        this.name = name;
    }

    public boolean touchCat() {
        catState = !catState;
        return catState;
    }

    public void getCatState() {
        out.println(catState == true ? "Кот проснулся" : "Кот спит");
    }

    public String getCatName() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        cat cat = (cat) o;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Мяу";
    }
}
