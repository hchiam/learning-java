public class StackLL {
    private class ListNode {
        public int value;
        public ListNode next;
        public ListNode() {
            value = -1;
            next = null;
        }
        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }
    private ListNode elemTopOfStack = new ListNode();
    public void add(int x) {
        if (elemTopOfStack == null) {
            elemTopOfStack = new ListNode(x,null);
        } else {
            elemTopOfStack = new ListNode(x,elemTopOfStack);
        }
    }
    public int remove() {
        int temp = elemTopOfStack.value;
        elemTopOfStack = elemTopOfStack.next;
        return temp;
    }
    public static void main(String[] args) {
        StackLL stack = new StackLL();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        System.out.println(stack.remove());
        System.out.println(stack.remove());
        System.out.println(stack.remove());
    }
}