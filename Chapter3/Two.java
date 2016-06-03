package Chapter3;

import java.util.Stack;

/**
 * Created by yuwang on 5/15/16.
 */
public class Two {


    public static void main(String[] argus) throws Exception {


        MinStack<Integer> minStack = new MinStack<Integer>();  // 100 is the size of each stack

        for (int i = 0; i < 30; i++) {
            minStack.push(i);

        }

        System.out.println(minStack.min());
        System.out.println(minStack.peek());
        System.out.println(minStack.pop());
        System.out.println(minStack.peek());


    }


    private static class MinStack<Integer> {

        private Stack<ValueNode> stack = null;

        public MinStack() {

            this.stack = new Stack<>();
        }


        public void push(int i) {

            ValueNode valueNode = new ValueNode(i);

            if (this.stack.empty()) {

                valueNode.setMin(i);
                this.stack.push(valueNode);

            } else {

                valueNode.setMin(Math.min(this.stack.peek().getMin(), i));

                this.stack.push(valueNode);

            }


        }

        public int min() {

            return this.stack.peek().getMin();
        }


        public int pop() {

            return this.stack.pop().getValue();

        }

        public int peek() {

            return this.stack.peek().getValue();

        }

        private class ValueNode {

            private int value;
            private int min;

            public ValueNode(int value) {
                this.value = value;
            }

            public int getMin() {
                return min;
            }

            public void setMin(int min) {
                this.min = min;
            }

            public int getValue() {
                return value;
            }

            public void setValue(int value) {
                this.value = value;
            }
        }


    }
}
