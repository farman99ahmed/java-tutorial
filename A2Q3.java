class FetchData extends Thread {
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e);

        }
        System.out.println("fetchData is running");
    }
    public static void main(String args[]) {
        FetchData t1 = new FetchData();
        t1.start();
    }
}

class ProcessData implements Runnable {
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);

        }
        System.out.println("processData is running");
    }
    public static void main(String args[]) {
        ProcessData p1 = new ProcessData();
        Thread t1 = new Thread(p1);
        t1.start();
    }
}

public class result {
    public static void main(String args[]) {
        FetchData f1 = new FetchData();
        ProcessData p1 = new ProcessData();
        Thread t2 = new Thread(p1);
        t2.setPriority(Thread.MIN_PRIORITY);
        f1.setPriority(Thread.MAX_PRIORITY);
        f1.start();
        t2.start();

    }
}
class fetchData extends Thread {
    public void run() {
        try {
            // long startTime = System.currentTimeMillis();
            Thread.sleep(500);
            long endTime = System.currentTimeMillis();
            System.out.println("fd " + (endTime - Main.startTime) + "ms");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("fetchData executed\n");
    }
}

class processData implements Runnable {
    public void run() {
        try {
            // long startTime = System.currentTimeMillis();
            Thread.sleep(500);
            long endTime = System.currentTimeMillis();
            System.out.println("pd " + (endTime - Main.startTime) + "ms");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("processData executed\n");
    }
}

public class Main {
    static long startTime = System.currentTimeMillis();

    public static void main(String args[]) {
        fetchData f1 = new fetchData();
        processData p1 = new processData();

        Thread t2 = new Thread(p1);
        t2.setPriority(Thread.MIN_PRIORITY);
        f1.setPriority(Thread.MAX_PRIORITY);

        try {
            f1.start();
            f1.join();
            t2.start();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}