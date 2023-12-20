import java.util.*;

public class removeDuplicatesFromLL {
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        HashSet<Integer> data = new HashSet<Integer>();
        LinkedList returnList = null;
        while (linkedList != null) {
            if (!data.contains(linkedList.value)) {
                data.add(linkedList.value);
                if (returnList == null) {
                    returnList = new LinkedList(linkedList.value);
                } else {
                    LinkedList head = returnList;
                    while (head.next != null) {
                        head = head.next;
                    }
                    head.next = new LinkedList(linkedList.value);
                }
            }
            linkedList = linkedList.next;
        }

        return returnList;
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList(1);
        l1.next = new LinkedList(2);
        l1.next.next = new LinkedList(3);
        l1.next.next.next = new LinkedList(4);
        l1.next.next.next.next = new LinkedList(5);
        l1.next.next.next.next.next = new LinkedList(6);
        l1.next.next.next.next.next.next = new LinkedList(7);
        l1.next.next.next.next.next.next.next = new LinkedList(8);
        l1.next.next.next.next.next.next.next.next = new LinkedList(9);
        l1.next.next.next.next.next.next.next.next.next = new LinkedList(10);
        l1.next.next.next.next.next.next.next.next.next.next = new LinkedList(11);
        l1.next.next.next.next.next.next.next.next.next.next.next = new LinkedList(12);
        l1.next.next.next.next.next.next.next.next.next.next.next.next = new LinkedList(12);
        LinkedList returnedLL = removeDuplicatesFromLinkedList(l1);
        while (returnedLL != null) {
            System.out.println(returnedLL.value);
            returnedLL = returnedLL.next;
        }
    }
}
