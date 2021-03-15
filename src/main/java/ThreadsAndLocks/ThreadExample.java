package ThreadsAndLocks;

public class ThreadExample extends Thread {
    int count = 0;

    public void run() {
        System.out.println("Thread Starting.");
        try {
            while (count < 5) {
                Thread.sleep(500);
                System.out.println("In Thread, count is " + count);
                count++;
            }
        } catch (InterruptedException ex) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("Thread terminating.");
    }

    public static void main(String[] args) {
        RunnableThreadExample rte = new RunnableThreadExample();
        Thread thread = new Thread(rte);
        thread.start();
        while (rte.count != 5) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        ThreadExample te = new ThreadExample();
        te.start();

        while (te.count != 5) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}

class RunnableThreadExample implements Runnable {
    public int count = 0;
    @Override
    public void run() {
        System.out.println("RunnableThread starting.");
        try {
            while(count < 5) {
                Thread.sleep(500);
                count++;
            }
        } catch (InterruptedException ex) {
            System.out.println("RunnableThread interrupted.");
        }
        System.out.println("RunnableThread terminating.");
    }
}