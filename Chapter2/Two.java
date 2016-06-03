package Chapter2;

/**
 * Created by yuwang on 5/14/16.
 * find the last kth node
 */
public class Two {
    public static LinkedListNode theLastKthNode(LinkedListNode head, int k) {

        if (head == null) return null;

        LinkedListNode p1 = head;
        LinkedListNode p2 = head;

        int index = 0;
        while (index++ <= k - 1) {

            p2 = p2.next;
            if (p2 == null) throw new IndexOutOfBoundsException();

        }

        while (p1 != null && p2 != null) {

            p1 = p1.next;
            p2 = p2.next;

        }

        return p1;

    }


    public static void main(String[] argus) {

        LinkedListNode test1 = new LinkedListNode(1);
        LinkedListNode test2 = new LinkedListNode(2);
        LinkedListNode test3 = new LinkedListNode(3);
        LinkedListNode test4 = new LinkedListNode(4);
        LinkedListNode test5 = new LinkedListNode(5);

        test1.next = test2;
        test2.next = test3;
        test3.next = test4;
        test4.next = test5;

        LinkedListNode head = test1;


        while (test1 != null) {
            System.out.println(test1.data);
            test1 = test1.next;
        }

        System.out.println("  ");

        System.out.println(theLastKthNode(head, 3));


    }


}
