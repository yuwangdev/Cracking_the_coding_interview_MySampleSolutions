package Chapter3;

import java.util.Stack;

/**
 * Created by yuwang on 5/15/16.
 * use two stack to implement a queue
 */
public class Five {


    public static void main(String[] argus) throws Exception {


        MyQueue myQueue = new MyQueue();

        for (int i = 0; i < 30; i++) {
            MyQueue.push(i);

        }

        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());


    }

    private static class MyQueue {

        private static Stack<Integer> stack1 = null;
        private static Stack<Integer> stack2 = null;

        public MyQueue() {

            stack1 = new Stack<>();
            stack2 = new Stack<>();

        }


        public static void push(int node) {

            stack1.push(node);


        }

        public Boolean isEmpty() {
            return stack1.isEmpty();
        }

        public static int pop() {

            if (!stack2.empty()) stack2.clear();

            while (!stack1.empty()) {

                stack2.push(stack1.pop());

            }


            int temp = stack2.pop();

            if (!stack1.empty()) stack1.clear();

            while (!stack2.empty()) {

                stack1.push(stack2.pop());
            }

            return temp;


        }


    }


}
