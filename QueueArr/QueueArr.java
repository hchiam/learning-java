public class QueueArr {
    int[] array;
    int front = -1;
    int back = -1;
    int size;
    public QueueArr(int maxSize) {
        size = maxSize; //this.size = maxSize;
        array = new int[size];
    }
    public void add(int x) {
        if (back == size-1) {
            back = 0;
        } else {
            back ++;
        }
        array[back] = x;
    }
    public int remove() {
        if (front == size-1) {
            front = 0;
        } else {
            front ++;
        }
        int elem = array[front];
        array[front] = 0;
        return elem;
    }
    public void print() {
        String temp = "";
        for (int i=0; i<size; i++) {
            temp += array[i];
        }
        System.out.println(temp);
    }
    public static void main(String[] args) {
        QueueArr queue = new QueueArr(5);
        queue.print();
        queue.add(1);
        queue.print();
        queue.add(2);
        queue.print();
        queue.add(3);
        queue.print();
        System.out.println("remove: "+queue.remove());
        queue.print();
        System.out.println("remove: "+queue.remove());
        queue.print();
        System.out.println("remove: "+queue.remove());
        queue.print();
        queue.add(4);
        queue.print();
        queue.add(5);
        queue.print();
        queue.add(6);
        queue.print();
        queue.add(7);
        queue.print();
        System.out.println("remove: "+queue.remove());
        queue.print();
        System.out.println("remove: "+queue.remove());
        queue.print();
        System.out.println("remove: "+queue.remove());
        queue.print();
        System.out.println("remove: "+queue.remove());
        queue.print();
    }
}