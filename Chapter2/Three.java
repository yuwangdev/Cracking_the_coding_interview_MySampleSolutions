package Chapter2;

/**
 * Created by yuwang on 5/14/16.
 * delete one node in a unidirectional linkedlist
 */
public class Three {

    public static void deleteTheNode(LinkedListNode target) {

        if (target == null || target.next == null) throw new IllegalArgumentException();

        target.data = target.next.data;
        target.next = target.next.next;

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

        deleteTheNode(test3);


        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }


    }


}
