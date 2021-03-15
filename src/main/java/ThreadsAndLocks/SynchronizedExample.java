package ThreadsAndLocks;

public class SynchronizedExample {
    public static void main(String[] args) throws InterruptedException {
//        SynchronizedObjectExample obj1 = new SynchronizedObjectExample();
//        SynchronizedObjectExample obj2 = new SynchronizedObjectExample();
//        SynchronizedClassExample thread1 = new SynchronizedClassExample(obj1, "1");
//        SynchronizedClassExample thread2 = new SynchronizedClassExample(obj2, "2");
//        thread1.start();
//        thread2.start();

//        SynchronizedObjectExample obj3 = new SynchronizedObjectExample();
//        SynchronizedClassExample thread3 = new SynchronizedClassExample(obj3, "3");
//        SynchronizedClassExample thread4 = new SynchronizedClassExample(obj3, "4");
//        thread3.start();
//        thread4.start();

//        SynchronizedObjectExample obj4 = new SynchronizedObjectExample();
//        SynchronizedClassExample2 thread5 = new SynchronizedClassExample2(obj4, "5");
//        SynchronizedClassExample2 thread6 = new SynchronizedClassExample2(obj4, "6");
//        thread5.start();
//        thread6.start();

        SynchronizedBlockObjectExample obj5 = new SynchronizedBlockObjectExample();
        SynchronizedBlockClassExample thread7 = new SynchronizedBlockClassExample(obj5, "7");
        SynchronizedBlockClassExample thread8 = new SynchronizedBlockClassExample(obj5, "8");
        thread7.start();
        thread8.start();
    }
}

class SynchronizedClassExample extends Thread {
    private String name;
    private SynchronizedObjectExample myObject;
    public SynchronizedClassExample(SynchronizedObjectExample obj, String n) {
        name = n;
        myObject = obj;
    }

    public void run() {
        myObject.foo(name);
    }
}

class SynchronizedObjectExample {
    public synchronized void foo(String name) {
        try {
            System.out.println("Thread" + name + ".foo(): starting");
            Thread.sleep(3000);
            System.out.println("Thread" + name + ".foo(): ending");
        } catch (InterruptedException ex) {
            System.out.println("Thread" + name + ":interrupted.");
        }
    }

    public synchronized void bar(String name) {
        try {
            System.out.println("Thread" + name + ".bar(): starting");
            Thread.sleep(3000);
            System.out.println("Thread" + name + ".bar(): ending");
        } catch (InterruptedException ex) {
            System.out.println("Thread" + name + ":interrupted.");
        }
    }
}

class SynchronizedClassExample2 extends Thread {
    private String name;
    private SynchronizedObjectExample myObject;
    public SynchronizedClassExample2(SynchronizedObjectExample obj, String n) {
        name = n;
        myObject = obj;
    }

    public void run() {
        if(name.equals("5")) myObject.foo(name);
        else if (name.equals("6")) myObject.bar(name);
    }
}

class SynchronizedBlockClassExample extends Thread {
    private String name;
    private SynchronizedBlockObjectExample myObject;
    public SynchronizedBlockClassExample(SynchronizedBlockObjectExample obj, String n) {
        name = n;
        myObject = obj;
    }

    public void run() {
        if(name.equals("7")) myObject.foo(name);
        else if (name.equals("8")) myObject.bar(name);
    }
}

class SynchronizedBlockObjectExample {
    public void foo(String name) {
        synchronized (this) {
            try {
                System.out.println("Thread" + name + ".foo(): starting");
                Thread.sleep(3000);
                System.out.println("Thread" + name + ".foo(): ending");
            } catch (InterruptedException ex) {
                System.out.println("Thread" + name + ":interrupted.");
            }
        }
    }

    public synchronized void bar(String name) {
        synchronized (this) {
            try {
                System.out.println("Thread" + name + ".bar(): starting");
                Thread.sleep(3000);
                System.out.println("Thread" + name + ".bar(): ending");
            } catch (InterruptedException ex) {
                System.out.println("Thread" + name + ":interrupted.");
            }
        }
    }
}
