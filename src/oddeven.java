// File: NumberThreadDemo.java

class EvenThread extends Thread {

    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Even thread interrupted");
            }
        }
    }
}

class OddThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 9; i += 2) {
            System.out.println("Odd: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Odd thread interrupted");
            }
        }
    }
}

public class NumberThreadDemo {

    public static void main(String[] args) {

        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();

        even.start();
        odd.start();

        System.out.println("Main thread is running...");
    }
}