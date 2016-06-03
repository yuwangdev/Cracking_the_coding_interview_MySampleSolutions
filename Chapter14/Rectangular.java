package Chapter14;

/**
 * Created by yuwang on 2016-05-24.
 */
public class Rectangular implements ShapeForFactory {

    public Rectangular() {
        System.out.println("init rect");

    }


    @Override
    public void draw() {
        System.out.println("draw rect");

    }
}
