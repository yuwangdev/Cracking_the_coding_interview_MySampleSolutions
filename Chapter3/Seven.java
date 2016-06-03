package Chapter3;

/**
 * Created by yuwang on 5/17/16.
 * Animal shelter, dog or cat, older first, any type when the same oldness
 */
public class Seven {


    public static void main(String[] argus) {

        AnimalController animalController = new AnimalController();

        animalController.enroll(new Dog("dog1"));
        animalController.enroll(new Cat("cat1"));
        animalController.enroll(new Cat("cat2"));
        animalController.enroll(new Dog("dog2"));

        System.out.println(animalController.release());
        System.out.println(animalController.release());
        System.out.println(animalController.release());
        System.out.println(animalController.release());


    }

}
