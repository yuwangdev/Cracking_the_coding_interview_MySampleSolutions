package Chapter2;

import java.util.Stack;

/**
 * Created by yuwang on 5/14/16.
 * check if a linkedlistNode is panlindrome
 */
public class Seven {

    public static boolean ifPanlindrom(LinkedListNode head) {

        if (head == null) return false;

        Stack<LinkedListNode> stack = new Stack<>();

        LinkedListNode slower = head;
        LinkedListNode faster = head;

        while (faster != null && faster.next != null) {

            stack.push(slower);
            slower = slower.next;
            faster = faster.next.next;

        }

        if (faster != null) slower = slower.next;

        while (slower != null) {


            LinkedListNode temp = stack.pop();

            if (slower.data != temp.data) return false;
            slower = slower.next;


        }


        return true;
    }


    public static void main(String[] argus) {

        LinkedListNode test1 = new LinkedListNode(1);
        LinkedListNode test2 = new LinkedListNode(2);
        LinkedListNode test3 = new LinkedListNode(5);
        LinkedListNode test4 = new LinkedListNode(2);
        LinkedListNode test5 = new LinkedListNode(2);

        test1.next = test2;
        test2.next = test3;
        test3.next = test4;
        test4.next = test5;

        LinkedListNode head1 = test1;

        while (test1 != null) {
            System.out.println(test1.data);
            test1 = test1.next;
        }

        System.out.println("  ");


        LinkedListNode evenTest1 = new LinkedListNode(1);
        LinkedListNode evenTest2 = new LinkedListNode(5);
        LinkedListNode evenTest3 = new LinkedListNode(5);
        LinkedListNode evenTest4 = new LinkedListNode(1);


        evenTest1.next = evenTest2;
        evenTest2.next = evenTest3;
        evenTest3.next = evenTest4;


        LinkedListNode evenHead = evenTest1;

        while (evenTest1 != null) {
            System.out.println(evenTest1.data);
            evenTest1 = evenTest1.next;
        }

        System.out.println("  ");


        System.out.println(ifPanlindrom(head1));
        System.out.println(ifPanlindrom(evenHead));


    }


}
