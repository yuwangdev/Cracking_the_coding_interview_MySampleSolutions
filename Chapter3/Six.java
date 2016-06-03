package Chapter3;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by yuwang on 5/17/16.
 * sort a stack, only given anotehr stack
 */
public class Six {

    public static Stack<Integer> sortStack(Stack<Integer> stack) {

        if (stack.size() == 0 || stack == null) return null;

        if (stack.size() == 1) return stack;

        Stack<Integer> temp = new Stack<>();

        if (temp.isEmpty()) temp.push(stack.pop());

        while (!stack.isEmpty()) {

            int topElement = stack.pop();

            while (!temp.isEmpty() && temp.peek() < topElement) {

                stack.push(temp.pop());
            }

            temp.push(topElement);

        }


        return temp;
    }

    public static void main(String argus[]) {

        Stack<Integer> stack = new Stack<>();

        stack.push(4);
        stack.push(5);
        stack.push(1);
        stack.push(333);
        stack.push(12);
        stack.push(7);
        stack.push(8);

        Iterator<Integer> iterator = stack.iterator();

        while (iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println("---");

        Stack sorted = sortStack(stack);

        Iterator<Integer> iteratorSorted = sorted.iterator();

        while (iteratorSorted.hasNext())
            System.out.println(iteratorSorted.next());


    }


}
