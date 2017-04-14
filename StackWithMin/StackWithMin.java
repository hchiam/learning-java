import java.util.Stack;
import java.util.Random;

public class StackWithMin extends Stack<Integer> {
    private Stack<Integer> sM;
    public StackWithMin() {
        sM = new Stack<Integer>();
    }
    public int min() {
        if (sM.empty()) {
            return Integer.MAX_VALUE;
        } else {
            return sM.peek();
        }
    }
    public void push(int d) {
        super.push(d);
        if (sM.empty() || d < min()) {
            sM.push(d);
        }
    }
    public Integer pop() {
        int d = super.pop();
        if (d == min()) {
            sM.pop();
        }
        return d;
    }
    
    public static void main(String args[]) {
        StackWithMin test = new StackWithMin();
        Random rand = new Random();
        int[] elems = new int[]{6,9,3,8,1,7,0};
        for (int elem : elems) {
            test.push(elem);
            System.out.print(elem + ", ");
        }
        System.out.println('\n');
        for (int i = 0; i < elems.length; i++) {
            System.out.println("Popped " + test.pop());
            System.out.println("New min is " + test.min());
        }
    }
}