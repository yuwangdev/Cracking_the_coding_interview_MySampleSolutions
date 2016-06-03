package Chapter2;

import java.util.Hashtable;

/**
 * Created by yuwang on 5/11/16.
 */
public class One {

    public static void removeDuplicateFromUnsortedLinkedListNode(LinkedListNode head) {

        // just do it in place, so time is O(n2), and space O(1)


        if (head == null) return;

        LinkedListNode current = head;


        while (current != null) {

            LinkedListNode runnner = current;

            while (runnner.next != null) {

                if (runnner.next.data != current.data) {   // runner starts from the current, so should use .next

                    runnner = runnner.next;

                } else {

                    runnner.next = runnner.next.next;

                }
            }


            current = current.next;

        }


    }


    public static void removeDuplicateFromUnsortedLinkedListNode2(LinkedListNode head) {

        // use prev method

        if (head == null) return;

        LinkedListNode previousNode = null;

        Hashtable<Integer, Boolean> hashtable = new Hashtable();

        while (head != null) {

            if (!hashtable.containsKey(head.data)) {

                hashtable.put(head.data, true);
                previousNode = head;
            } else {


                previousNode.next = head.next;


            }


            head = head.next;


        }


    }

    public static void main(String[] argus) {

        LinkedListNode test1 = new LinkedListNode(1);
        LinkedListNode test2 = new LinkedListNode(2);
        LinkedListNode test3 = new LinkedListNode(3);
        LinkedListNode test4 = new LinkedListNode(3);
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

        // removeDuplicateFromUnsortedLinkedListNode(head);
        removeDuplicateFromUnsortedLinkedListNode2(head);

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }


    }


}
