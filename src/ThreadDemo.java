// File: ThreadDemo.java

class MyThread extends Thread {

    private String threadName;

    // Constructor
    public MyThread(String name) {
        threadName = name;
    }

    // Task performed by the thread
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Count: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted");
            }
        }

        System.out.println(threadName + " finished!");
    }
}

public class ThreadDemo {

    public static void main(String[] args) {

        // Create threads
        MyThread thread1 = new MyThread("Thread-A");
        MyThread thread2 = new MyThread("Thread-B");

        // Start threads
        thread1.start();
        thread2.start();

        System.out.println("Main thread continues...");
    }
}