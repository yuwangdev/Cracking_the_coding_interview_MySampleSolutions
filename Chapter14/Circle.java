package Chapter14;

/**
 * Created by yuwang on 2016-05-24.
 */
public class Circle implements ShapeForFactory {

    public Circle() {
        System.out.println("init circle");

    }


    @Override
    public void draw() {
        System.out.println("draw circle");

    }
}
