public class TestThis implements Runnable {
    public void run() {
        while (true) {
            System.out.print("\007");
        }
    }
    public static void main(String[] args) {
        System.out.println("\nUsing Terminal/Command-Line to run this? "
                           + "\nHit Ctrl+C to stop it.\n");
        TestThis test = new TestThis();
        Thread myThread = new Thread(test);
        myThread.start();
    }
}