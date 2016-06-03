package Chapter2;

/**
 * Created by yuwang on 5/14/16.
 * sort the linkedlist node as per x value
 */
public class Four {


    public static LinkedListNode sortPerX(LinkedListNode head, int x) {

        // create before list and after list
        // put value into each lists, as per the value looping over the linkedlistnode
        // put before and after together
        // return the head of the before

        if (head == null) return null;

        if (head.next == null) return head;

        LinkedListNode beforeHead = null;
        LinkedListNode beforeTail = beforeHead;
        LinkedListNode afterHead = null;
        LinkedListNode afterTail = afterHead;


        while (head != null) {

            LinkedListNode temp = head.next;
            head.next = null;

            if (head.data < x) {

                if (beforeHead == null) {

                    beforeHead = head;
                    beforeTail = beforeHead;

                }

                if (beforeHead != null) {

                    beforeTail.next = head;
                    beforeTail = head;

                }

            }

            if (head.data > x) {


                if (afterHead == null) {

                    afterHead = head;
                    afterTail = afterHead;

                }

                if (afterHead != null) {

                    afterTail.next = head;
                    afterTail = head;

                }

            }


            head = temp;

        }

        LinkedListNode xNode = new LinkedListNode(x);

        if (beforeHead == null) {
            xNode.next = afterHead;

            return xNode;
        }

        if (afterHead == null) {
            beforeTail.next = xNode;


            return beforeHead;
        }


        beforeTail.next = xNode;
        xNode.next = afterHead;


        return beforeHead;

    }

    public static void main(String[] argus) {

        LinkedListNode test1 = new LinkedListNode(11);
        LinkedListNode test2 = new LinkedListNode(12);
        LinkedListNode test3 = new LinkedListNode(3);
        LinkedListNode test4 = new LinkedListNode(14);
        LinkedListNode test5 = new LinkedListNode(5);
        LinkedListNode test6 = new LinkedListNode(200);
        LinkedListNode test7 = new LinkedListNode(7);
        LinkedListNode test8 = new LinkedListNode(1);
        LinkedListNode test9 = new LinkedListNode(9);
        LinkedListNode test10 = new LinkedListNode(10);
        LinkedListNode test11 = new LinkedListNode(3);

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

        LinkedListNode head = test1;


        while (test1 != null) {

            System.out.println(test1.data);

            test1 = test1.next;
        }

        System.out.println("-------");

        LinkedListNode result = sortPerX(head, 7);


        while (result != null) {

            System.out.println(result.data);

            result = result.next;
        }


    }


}
