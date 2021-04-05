package Basics;

import java.util.Scanner;

public class ThreadControl {
    public static void main(String[] args){
        Runnable r = new MyThreadC();
        Thread t1 = new Thread(r, "Thread 1");
        Thread t2 = new Thread(r, "Thread 2");
        Thread t3 = new Thread(r, "Thread 3");
        Scanner sc = new Scanner(System.in);
        t1.start();
        t2.start();
        t3.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        System.out.println(t3.getState());
        System.out.print("Enter String");
        String str = sc.nextLine();

        t1.interrupt();

        t2.interrupt();
        t3.interrupt();
//        t1.start();
//        t2.start();

    }
}

class MyThreadC implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 5 ; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }
    }
}
