package Vishwa_Linked_List;

import java.util.HashMap;
import java.util.HashSet;

public class NewTestLL {

    public static void printLL(ListNode head){

        while(head!=null){
            System.out.println(head.getData());
            head = head.getNext();
        }
    }

    public static int lengthLL(ListNode head){

        int count =0;
        while(head!=null){
            count++;
            head=head.getNext();
        }

        return count;
    }

    // reverse LL

    public static ListNode reverseLL(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while(curr!=null){
            next = curr.getNext();
            curr.setNext(prev);
            prev=curr;
            curr = next;
        }
        return prev;
    }

    // Middle element of LL, One traverse

    public static ListNode midElement(ListNode head){

        ListNode slow =  head;
        ListNode fast =  head;

        // 1 2 3 4

        while(fast!=null&&fast.getNext()!=null){
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return slow;
    }

    // Cycle in the LL

    public static boolean cycle(ListNode head){

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null&&fast.getNext()!=null){
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if(slow==fast){
                return true;
            }
        } return false;
    }

    // Find the node from which cycle starts

    public static ListNode nodeStart(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode rightStart = head;
        ListNode leftStart = head;

        while(fast!=null&&fast.getNext()!=null){
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if(slow==fast){
                rightStart = slow;
                break;
            }
        }
        while (leftStart!=rightStart){
            leftStart = leftStart.getNext();
            rightStart = rightStart.getNext();
        } return leftStart;

    }

    // Assignments

    public static boolean searchElement(ListNode head, int target){
        while(head!=null){
            if(head.getData()==target){
                return true;
            }
            head = head.getNext();
        } return false;
    }

    public static int nthFromEnd(ListNode head, int n){

        int count = lengthLL(head);
        int nthNode =  count - n;

        for (int i = 0; i < nthNode; i++) {
            head = head.getNext();
        }
        return head.getData();
    }

    public static ListNode nthNode(ListNode head, int n){
        for(int i = 0;i<n;i++){
            head = head.getNext();
        } return head;
    }

    public static void frequecyOfOccurence(ListNode head, int n){

        /*Linked List and key
            traverse each node
            put it to hashmap with count
            Return the count of the node*/

        HashMap<Integer, Integer> count = new HashMap<>();

        while(head!=null){
            int key = head.getData();
            if(count.containsKey(key)){
                int countkey =  count.get(key);
                countkey++;
                head = head.getNext();
            } else {
                count.put(key,1);
                head = head.getNext();
            }
        }
    }

    public static int frequencyElement(ListNode head, int n){

        int count =0;
        while(head!=null){
            if(head.getData()==n){
                count++;
            }
            head = head.getNext();
        } return count;
    }

    public static int detectAndCountLoop(ListNode head){
        ListNode start = nodeStart(head);
        ListNode loop = start;
        int count =0;
        while(loop.getNext()!=start){
            count++;
            loop = loop.getNext();
        } return count;
    }

    public static boolean isPalindrome(ListNode head){

        int length = lengthLL(head);
        char [] palindrome = new char[length];
        int i = 0;

        while(head!=null){
            palindrome[i] = (char) head.getData();
            i++;
            head= head.getNext();
        }

        int j=0;
        int k=palindrome.length-1;

        while(j<=k){
            if(palindrome[j]!=palindrome[k]){
                System.out.println(palindrome[j]);
                System.out.println(palindrome[k]);
                return false;
            } else if(palindrome[j]==palindrome[k]){
                j++;
                k--;
            }
        }
        return true;

    }

    public static void removeDuplicates(ListNode head){

      //  HashSet<Integer> set = new HashSet<>();

        //11->11->11->21->43->43->60
        while(head!=null){
            if(head.getNext()!=null&&head.getData()==head.getNext().getData()){
                head.setNext(head.getNext().getNext());
            } else {
                head = head.getNext();
            }
              }
    }


    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

//        ListNode node1 = new ListNode('R');
//        ListNode node2 = new ListNode('A');
//        ListNode node3 = new ListNode('D');
//        ListNode node4 = new ListNode('A');
//        ListNode node5 = new ListNode('R');

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
//      node5.setNext(node3);
//
//         printLL(node1);
//         System.out.println(lengthLL(node1));
//         ListNode rev = reverseLL(node1);
//         printLL(rev);
//
//        System.out.println(midElement(node1));
//        System.out.println(cycle(node1));
//        System.out.println(nodeStart(node1));
//        System.out.println(searchElement(node1, 1));
//        System.out.println(nthFromEnd(node1,2));
//        System.out.println(nthNode(node1,4));
//         frequecyOfOccurence(node1,1);
//        System.out.println(frequencyElement(node1,1));
//        System.out.println(isPalindrome(node1));
            removeDuplicates(node1);

    }
}
