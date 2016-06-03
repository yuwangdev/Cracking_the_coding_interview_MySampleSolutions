package Chapter14;

/**
 * Created by yuwang on 5/19/16.
 */
public class Factory {

    public Factory() {
        System.out.println("init factory ");
    }

    public ShapeForFactory getShape(String str) {

        if (str == "circle") return new Circle();
        if (str == "rect") return new Rectangular();

        return null;


    }


}
