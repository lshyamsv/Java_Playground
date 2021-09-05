package Vishwa_Linked_List;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

    public static int length(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.getNext();
        }
        return count;
    }

    public static int midElement(ListNode head) {
        int count = length(head);
        count = count / 2;
        for (int i = 0; i < count; i++) {
            head = head.getNext();
        }
        return head.getData();
    }

    public static void printData(ListNode head) {

        while (head != null) {
            System.out.println(head.getData());
            head = head.getNext();
        }

    }

    // 1 2 3 4 5
    public static int kthElementFromEnd(ListNode head, int k) {

        int length = length(head);
        int position = length - k + 1;

        for (int i = 0; i < position - 1; i++) {
            head = head.getNext();
        }
        return head.getData();
    }

    public static ListNode reverseLinkedList(ListNode head) {
        //1->2->3->4
        //4->3->2->1

        ListNode prev = null;
        ListNode cur = head;
        ListNode nextnode = null;

        while (cur != null) {
            nextnode = cur.getNext(); // 1 // 2 // 3
            cur.setNext(prev);
            prev = cur; // null // null
            cur = nextnode; // 1  // 2

        }
        return prev;
    }

    public static boolean duplicatesLinkedList(ListNode head) {

        HashMap<Integer, Integer> map = new HashMap<>();
        while (head != null) {
            if (map.get(head.getData()) != null) {
                return true;
            } else {
                map.put(head.getData(), 1);
                head = head.getNext();
            }

        }
        return false;
    }

    public static boolean duplicatesLinkedListBF(ListNode head) {

        while (head != null) {
            ListNode curr = head.getNext();
            while (curr != null) {
                if (curr.getData() == head.getData()) {
                    return true;
                } else {
                    curr = curr.getNext();
                }
            }
            head = head.getNext();
        }
        return false;
    }

    public static boolean cycleLinkedList(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null) {
            slow = slow.getNext();
            fast = (fast.getNext());
            if (fast != null) {
                fast = fast.getNext();
            }
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static int keyLinkedList(ListNode head, int key) {

        int count = 0;
        while (head != null) {
            if (head.getData() == key) {
                count++;
            }
            head = head.getNext();
        }
        return count;
    }


    public static int loopStartLinkedList(ListNode head) {
        // O(N) and O(1)

        ListNode slow = head;
        ListNode fast = head;
        ListNode first = head;
        ListNode second = head;
        while (fast != null) {
            slow = slow.getNext();
            fast = (fast.getNext());
            if (fast != null) {
                fast = fast.getNext();
            }
            if (slow == fast) {
                // first = slow;
                second = fast;
                break;
            }
        }
        while (first != null && second != null) {
            if (first.getData() == second.getData()) {
                return first.getData();
            } else {
                first = first.getNext();
                second = second.getNext();
            }
        }
        return -1;
    }

    public static void removeDuplicates(ListNode head) {

        //  ListNode curr = head;

        while (head != null) {
            if (head.getNext() != null && head.getData() == head.getNext().getData()) {
                head.setNext(head.getNext().getNext());
            } else {
                head = head.getNext();
            }
        }
    }


    public static void removeDuplicatesUnSorted(ListNode head) {

        LinkedHashSet<ListNode> set = new LinkedHashSet<>();

        while (head != null) {
            set.add(head);
            head = head.getNext();
        }

        ListNode newhead = null;
        ListNode prev = null;

        for (ListNode node : set) {
            if (newhead == null) {
                newhead = node;
                prev = newhead;
            } else {
                prev.setNext(node);
                prev = node;
            }
        }
        head = newhead;

    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        //  node5.setNext(node3);

        // System.out.println(length(node1));
        // System.out.println(midElement(node1));
         System.out.println(kthElementFromEnd(node1, 3));
        //   ListNode result = reverseLinkedList(node1);
        //  printData(result);

        //  System.out.println(duplicatesLinkedListBF(node1));
        //   System.out.println(cycleLinkedList(node1));
        //   System.out.println(keyLinkedList(node1, 1));
        // System.out.println(loopStartLinkedList(node1));
//        printData(node1);
//        removeDuplicatesUnSorted(node1);
//        System.out.println();
//        printData(node1);


    }
}
