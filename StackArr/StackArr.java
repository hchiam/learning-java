public class StackArr {
    private int[] stack = new int[5];
    private int iTopOfStack = -1; // initialize to
    public void add(int x) {
        // update index of top of stack
        iTopOfStack ++;
        // add to top of stack
        stack[iTopOfStack] = x;
    }
    public int remove() {
        int elem;
        // get top of stack
        elem = stack[iTopOfStack];
        // update stack: update index of top of stack
        iTopOfStack --;
        return elem;
    }
    public static void main(String[] args) {
        StackArr stack = new StackArr();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        System.out.println(stack.remove());
        System.out.println(stack.remove());
        System.out.println(stack.remove());
    }
}