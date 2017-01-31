public class QueueLL {
    private class ListNode {
        public int value;
        public ListNode next = null;
        public ListNode(int value) {
            this.value = value;
        }
    }
    public ListNode front = null;
    public ListNode back = null;
    public void add(int x) {
        if (back == null) {
            back = new ListNode(x);
            front = back;
        } else {
            back.next = new ListNode(x);
            back = back.next;
        }
    }
    public Integer remove() { // Integer can be returned as null, int cannot
        if (front == null) {
            return null;
        } else {
            ListNode temp = front;
            front = front.next;
            return temp.value;
        }
    }
    public static void main(String[] args) {
        QueueLL queue = new QueueLL();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}