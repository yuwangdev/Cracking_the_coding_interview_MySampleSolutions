package Chapter3;

/**
 * Created by yuwang on 5/17/16.
 */
public class Three_Stack {

    private int capacity;
    private Three_Node bottom = null;
    private Three_Node top = null;
    private int size;


    public Three_Stack(int capacity) {
        this.capacity = capacity;
        this.size = 0;
    }


    public Boolean isEmpty() {

        return this.size > 0 ? false : true;
    }


    public Boolean push(int data) {

        if (this.size >= this.capacity) throw new ArrayIndexOutOfBoundsException();

        if (this.size == 0) {

            Three_Node temp = new Three_Node(data);

            this.bottom = temp;
            this.top = temp;
            this.bottom.above = this.top;
            this.top.below = this.bottom;

            this.size++;
            return true;


        } else {

            Three_Node temp = new Three_Node(data);
            this.size++;
            this.top.above = temp;
            this.top = temp;
            return true;

        }


    }


    public int pop() {

        if (this.size == 0) throw new ArrayIndexOutOfBoundsException();

        int temp = this.top.data;

        this.top = this.top.below;

        this.size--;

        return temp;
    }

    public int peek() {

        return this.size > 0 ? this.top.data : null;
    }

    public int removeFromBottom() {

        if (this.size == 0) throw new ArrayIndexOutOfBoundsException();

        int temp = this.bottom.data;

        this.bottom = this.bottom.above;

        this.size--;
        return temp;

    }

    public int size() {
        return this.size;
    }


}
