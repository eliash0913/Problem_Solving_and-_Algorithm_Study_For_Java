package Basics;

public class MultiThread {
    public static void main(String[] arg){
        Runnable t1 = new MyThread();
        Runnable t2 = new MyThread2();
        Runnable d1 = new MyDaemon();
        ThreadGroup tg1 = new ThreadGroup("Group1");
        ThreadGroup tg2 = new ThreadGroup("Group2");
        Thread t1_1 = new Thread(tg1,t1, "T1_1");
        Thread t1_2 = new Thread(tg1, t1, "T1_2");
        Thread t2_1 = new Thread(tg2, t2, "T2_1");
        Thread daemon = new Thread(d1, "Daemon");
        daemon.setDaemon(true);
        daemon.start();
        t1_1.setPriority(10);
        t1_2.setPriority(5);
        t2_1.setPriority(1);
        t1_1.start();
        t1_2.start();
        t2_1.start();

    }
}

class MyThread implements Runnable{
    @Override
    public void run() {
        try {
            for(int i = 0; i < 5; i++) {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getThreadGroup());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThread2 implements Runnable{
    @Override
    public void run() {
        try {
            for(int i = 0; i < 5; i++) {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getThreadGroup());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class MyDaemon implements Runnable{

    @Override
    public void run() {
        try {
           while (true){
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName());
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}