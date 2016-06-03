package Chapter2;

/**
 * Created by yuwang on 5/15/16.
 */
public class Five {


    public static LinkedListNode addFromHead(LinkedListNode head1, LinkedListNode head2) {

        if (head1 == null && head2 == null) return null;
        if (head1 == null || head2 == null) return head1 == null ? head2 : head1;

        return addition(head1, head2, 0);


    }

    private static LinkedListNode addition(LinkedListNode head1, LinkedListNode head2, int carryOver) {

        // base case:
        if (head1 == null && head2 == null && carryOver == 0) return null;

        int rawValue = carryOver;

        if (head1 == null || head2 == null) {

            rawValue = head1 == null ? rawValue + head2.data : rawValue + head1.data;

        } else {

            rawValue = head1.data + head2.data;
        }


        int newCarryOver = rawValue >= 10 ? 1 : 0;

        LinkedListNode result = new LinkedListNode(rawValue % 10);
        LinkedListNode next = null;


        if (head1.next == null && head2.next == null && newCarryOver != 0) {
            next = new LinkedListNode(newCarryOver);

        } else {

            next = addition(head1.next, head2.next, newCarryOver);
        }

        result.next = next;

        return result;
    }


    public static void main(String[] argus) {

        LinkedListNode test1 = new LinkedListNode(3);
        LinkedListNode test2 = new LinkedListNode(8);
        LinkedListNode test3 = new LinkedListNode(4);

        test1.next = test2;
        test2.next = test3;


        LinkedListNode Test1 = new LinkedListNode(2);
        LinkedListNode Test2 = new LinkedListNode(7);
        LinkedListNode Test3 = new LinkedListNode(5);

        Test1.next = Test2;
        Test2.next = Test3;

        LinkedListNode head = test1;
        LinkedListNode Head = Test1;


        while (test1 != null) {

            System.out.println(test1.data + " : " + Test1.data);

            test1 = test1.next;
            Test1 = Test1.next;
        }

        System.out.println("-------");

        LinkedListNode result = addFromHead(head, Head);


        while (result != null) {

            System.out.println(result.data);

            result = result.next;
        }


    }


}
