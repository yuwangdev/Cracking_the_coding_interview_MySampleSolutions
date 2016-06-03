package Chapter3;

/**
 * Created by yuwang on 5/17/16.
 */
public abstract class Animal {

    private String name;
    private int oldness;

    public Animal(String name) {

        this.name = name;

    }

    public int getOldness() {
        return oldness;
    }

    public void setOldness(int oldness) {
        this.oldness = oldness;
    }

    public Boolean isOlder(Animal animal) {
        return this.oldness > animal.getOldness() ? true : false;

    }

    @Override
    public String toString() {

        return this.name + " : " + this.oldness;
    }
}
