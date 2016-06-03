package Chapter2;

import java.util.Hashtable;

/**
 * Created by yuwang on 5/14/16.
 * find where is the starting point of a circle linked list node
 */
public class Six {
    public static LinkedListNode posCircleMeet(LinkedListNode head) {

        if (head == null) return null;

        LinkedListNode slower = head;
        LinkedListNode faster = head;

        LinkedListNode whereToMeetInCircle = null;


        while (faster != null && faster.next != null) {

            slower = slower.next;
            faster = faster.next.next;
            if (slower == faster) {
                whereToMeetInCircle = slower;
                break;
            }

        }

        slower = head;

        while (faster != null && slower != null) {


            slower = slower.next;
            faster = faster.next;
            if (slower == faster) {
                break;


            }


        }


        return slower;
    }

    public static void main(String[] argus) {

        LinkedListNode test1 = new LinkedListNode(1);
        LinkedListNode test2 = new LinkedListNode(2);
        LinkedListNode test3 = new LinkedListNode(3);
        LinkedListNode test4 = new LinkedListNode(4);
        LinkedListNode test5 = new LinkedListNode(5);
        LinkedListNode test6 = new LinkedListNode(6);
        LinkedListNode test7 = new LinkedListNode(7);
        LinkedListNode test8 = new LinkedListNode(8);
        LinkedListNode test9 = new LinkedListNode(9);
        LinkedListNode test10 = new LinkedListNode(10);
        LinkedListNode test11 = new LinkedListNode(11);

        test1.next = test2;
        test2.next = test3;
        test3.next = test4;
        test4.next = test5;
        test5.next = test6;
        test6.next = test7;
        test7.next = test8;
        test8.next = test9;
        test9.next = test10;
        test10.next = test11;
        test11.next = test5;


        LinkedListNode head = test1;


        Hashtable<Integer, Boolean> hashtable = new Hashtable<>();

        while (test1 != null) {

            System.out.println(test1.data);
            if (hashtable.containsKey(test1.data)) {
                break;
            } else {
                hashtable.put(test1.data, true);

            }
            test1 = test1.next;
        }

        System.out.println("  ");

        System.out.println(posCircleMeet(head));


    }


}
