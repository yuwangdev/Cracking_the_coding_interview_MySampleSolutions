package Chapter3;

/**
 * Created by yuwang on 5/15/16.
 * use an array to implement three stacks
 */
public class One {


    public static void main(String[] argus) throws Exception {


        ThreeStacks<Integer> threeStacks = new ThreeStacks<Integer>(100);  // 100 is the size of each stack

        System.out.println(threeStacks.isEmpty(0));

        for (int i = 0; i < 30; i++) {
            threeStacks.push(0, i);
            threeStacks.push(1, i * 2);
            threeStacks.push(2, i * i);
        }

        System.out.println(threeStacks.isEmpty(2));

        for (int i = 0; i < 10; i++) {
            System.out.println(threeStacks.peek(0));
            System.out.println(threeStacks.peek(1));
            System.out.println(threeStacks.peek(2));
        }

        for (int i = 0; i < 30; i++) {
            System.out.println(threeStacks.pop(0));
            System.out.println(threeStacks.pop(1));
            System.out.println(threeStacks.pop(2));
        }

        System.out.println(threeStacks.isEmpty(0));
        System.out.println(threeStacks.isEmpty(1));
        System.out.println(threeStacks.isEmpty(2));


    }


    private static class ThreeStacks<Integer> {
        private int stackSize;
        private int[] list;
        private int[] pointers = new int[3];

        public ThreeStacks(int stackSize) {
            this.stackSize = stackSize;

            this.list = new int[3 * stackSize];
            pointers[0] = -1;
            pointers[1] = -1;
            pointers[2] = -1;


        }


        public boolean isEmpty(int stackNumber) {
            if (stackNumber > 2) throw new IllegalArgumentException();

            return pointers[stackNumber] == -1 ? true : false;

        }


        public int peek(int stackNumber) {

            int position = calculateAbsolutePositionInArrayList(stackNumber, pointers[stackNumber]);


            return this.list[position];

        }

        public int pop(int stackNumber) {

            int position = calculateAbsolutePositionInArrayList(stackNumber, pointers[stackNumber]--);

            return this.list[position];


        }

        public void push(int stackNumber, int value) {

            int position = calculateAbsolutePositionInArrayList(stackNumber, ++pointers[stackNumber]);

            if (pointers[stackNumber] >= stackSize) throw new StackOverflowError();

            this.list[position] = value;


        }

        private int calculateAbsolutePositionInArrayList(int stackNumber, int currentPointer) {

            return stackNumber * stackSize + currentPointer;


        }
    }
}
