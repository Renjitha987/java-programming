
// File: ThreadDemo2.java

class MyRunnable implements Runnable {

    private String taskName;

    // Constructor
    public MyRunnable(String name) {
        taskName = name;
    }

    // Task performed by the thread
    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(taskName + " - Processing: " + i);

            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println(taskName + " interrupted");
            }
        }

        System.out.println(taskName + " completed!");
    }
}

public class ThreadDemo2 {

    public static void main(String[] args) {

        // Create tasks
        MyRunnable task1 = new MyRunnable("Task-1");
        MyRunnable task2 = new MyRunnable("Task-2");

        // Create threads
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        // Start threads
        thread1.start();
        thread2.start();

        System.out.println("Main thread is free to do other work");
    }
}