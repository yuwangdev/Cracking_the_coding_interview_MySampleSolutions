package Chapter3;

/**
 * Created by yuwang on 5/17/16.
 */
public class Three_StackTest {

    @org.junit.Test
    public void testIsEmpty() throws Exception {

        Three_Stack three_stack = new Three_Stack(5);
        System.out.println(three_stack.isEmpty());
        System.out.println(three_stack.push(5));
        System.out.println(three_stack.isEmpty());


    }

    @org.junit.Test
    public void testPush() throws Exception {

        Three_Stack three_stack = new Three_Stack(110);
        System.out.println(three_stack.isEmpty());
        System.out.println(three_stack.push(5));
        System.out.println(three_stack.isEmpty());

        int i = 0;
        while (i++ < 100) three_stack.push(i);


    }

    @org.junit.Test
    public void testPop() throws Exception {

        Three_Stack three_stack = new Three_Stack(5);
        System.out.println(three_stack.isEmpty());
        System.out.println(three_stack.push(5));
        System.out.println(three_stack.pop());
        System.out.println(three_stack.isEmpty());


    }

    @org.junit.Test
    public void testPeek() throws Exception {

        Three_Stack three_stack = new Three_Stack(5);
        System.out.println(three_stack.isEmpty());
        System.out.println(three_stack.push(5));
        System.out.println(three_stack.peek());
        System.out.println(three_stack.isEmpty());

    }

    @org.junit.Test
    public void testRemoveFromBottom() throws Exception {

        Three_Stack three_stack = new Three_Stack(5);
        System.out.println(three_stack.isEmpty());
        System.out.println(three_stack.push(2));
        System.out.println(three_stack.push(3));
        System.out.println(three_stack.push(4));
        System.out.println(three_stack.peek());
        System.out.println(three_stack.isEmpty());
        System.out.println(three_stack.removeFromBottom());


    }
}