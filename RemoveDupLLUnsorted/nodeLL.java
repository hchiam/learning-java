public class nodeLL { // linked-list implementation with only 1 class
    Integer value = null; // Integer can take null, int cannot
    nodeLL next = null;
    public nodeLL() {
    }
    public nodeLL(int v) {
        this.value = v;
    }
    public void add(int v) {
        nodeLL n = new nodeLL(v);
        if (this.next == null) {
            this.next = n;
        } else {
            nodeLL nn = this.next;
            while (nn.next != null) {
                nn = nn.next;
            }
            nn.next = n;
        }
    }
    public void deleteVal(Integer v, nodeLL head) {
        if (head != null) {
            // need at least current & next nodes, with "next" node possibly to be deleted (marked)
            // except if head
            if (head.value == v) {
                head = head.next;
            } else if (head.next != null) {
                nodeLL n = head;
                while (n.next != null && n.next.value != v) {
                    n = n.next;
                }
                if (n.next != null && n.next.value == v) {
                    n.next = n.next.next;
                }
            }
        }
    }
    public void printLL() {
        System.out.println(this.value);
        if (this.next != null) {
            this.next.printLL();
        }
    }
    public int size() {
        nodeLL n = this;
        int size = 0;
        while (this != null && n.next != null) {
            n = n.next;
            size ++;
        }
        return size;
    }
}