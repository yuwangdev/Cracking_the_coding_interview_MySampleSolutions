package Chapter3;

import java.util.LinkedList;


/**
 * Created by yuwang on 5/17/16.
 */
public class AnimalController {

    private int oldness;
    private LinkedList<Dog> dogs = null;
    private LinkedList<Cat> cats = null;

    public AnimalController() {

        oldness = 0;
        dogs = new LinkedList<Dog>();
        cats = new LinkedList<Cat>();


    }

    public Boolean enroll(Animal animal) {

        if (animal instanceof Dog) {

            animal.setOldness(this.oldness);
            dogs.add((Dog) animal);
            this.oldness++;
            return true;


        } else {

            animal.setOldness(this.oldness);

            cats.add((Cat) animal);
            this.oldness++;
            return true;


        }


    }

    public Animal release() {

        if (dogs.size() == 0 && cats.size() == 0) throw new ArrayIndexOutOfBoundsException();

        if (dogs.size() == 0) return cats.poll();

        if (cats.size() == 0) return dogs.poll();

        Dog dog = dogs.peek();
        Cat cat = cats.peek();

        if (dog.isOlder(cat)) {
            return dogs.poll();
        } else {
            return cats.poll();
        }


    }


}
