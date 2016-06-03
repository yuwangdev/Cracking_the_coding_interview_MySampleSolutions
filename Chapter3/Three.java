package Chapter3;

import java.util.ArrayList;

/**
 * Created by yuwang on 5/17/16.
 * setOfStacks, also need to have a popAt method for a specified stack
 */
public class Three {

    private int capacity;
    private int size;
    private ArrayList<Three_Stack> threeStacks;

    public Three(int capacity) {   // capacity for each single stack
        this.capacity = capacity;
        threeStacks = null;
        this.size = 0;

    }

    public Boolean isEmpty() {
        return this.size > 0 ? false : true;
    }

    public Boolean push(int data) {

        if (this.size == 0) {
            this.size++;
            Three_Stack temp = new Three_Stack(this.capacity);

            temp.push(data);
            this.threeStacks.add(temp);

            return true;


        } else if (this.size < this.capacity) {
            this.size++;
            this.threeStacks.get(0).push(data);
            return true;

        } else if (this.size > this.capacity) {

            Three_Stack lastStack = this.threeStacks.get(this.threeStacks.size() - 1);
            if (lastStack.size() < this.capacity) {
                lastStack.push(data);
                this.size++;
                return true;

            } else {

                Three_Stack newStack = new Three_Stack(this.capacity);
                newStack.push(data);
                this.threeStacks.add(newStack);
                this.size++;
                return true;
            }

        }
        return false;


    }


    public int pop() {

        if (this.size == 0) throw new ArrayIndexOutOfBoundsException();

        Three_Stack lastStack = this.threeStacks.get(this.threeStacks.size() - 1);
        int temp = lastStack.pop();
        this.size--;

        if (lastStack.size() == 0) this.threeStacks.remove(this.threeStacks.size() - 1);

        return temp;
    }

    public int peek() {

        if (this.size == 0) throw new ArrayIndexOutOfBoundsException();

        Three_Stack lastStack = this.threeStacks.get(this.threeStacks.size() - 1);
        return lastStack.peek();
    }

    public int popAt(int index) {

        if (index >= this.threeStacks.size()) throw new IllegalArgumentException();

        int temp = this.threeStacks.get(index).pop();

        this.size--;

        if (index + 1 < this.threeStacks.size()) {

            this.threeStacks.get(index).push(this.threeStacks.get(index + 1).removeFromBottom());

        }

        return temp;
    }

}
