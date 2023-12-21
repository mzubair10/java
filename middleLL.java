public class middleLL {
    public static class LinkedList {
        int value;
        LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static LinkedList middleNode(LinkedList linkedList) {
        LinkedList temp = linkedList;
        double count = 0, tempCount = 0;
        while (temp != null) {
            count = count + 1;
            temp = temp.next;
        }
        temp = linkedList;
        count = Math.floor(count / 2);
        while (temp != null && tempCount < count) {
            temp = temp.next;
            tempCount++;
        }
        return temp;
    }

    public static LinkedList middleNodeR(LinkedList linkedList) {
        LinkedList slowPtr = linkedList, fastPtr = linkedList;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList(1);
        l1.next = new LinkedList(2);
        l1.next.next = new LinkedList(3);
        // l1.next.next.next = new LinkedList(4);
        LinkedList retList = middleNodeR(l1);
        while (retList != null) {
            System.out.println(retList.value);
            retList = retList.next;
        }
    }
}
