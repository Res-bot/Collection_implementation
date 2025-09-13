class thread1class extends Thread {
    thread1class(String name){
        super(name);
        System.out.println("Thread " + name + ", " + " State: new");
    }

    public void run(){
        System.out.println("Thread " + Thread.currentThread().getName() + " State: running");
        for (int i = 4; i > 0; i--) {
            System.out.println("Thread: " + Thread.currentThread().getName() + ", " + i);
        }
        System.out.println("Thread: " + Thread.currentThread().getName() + " State: Dead");
    }

    public void start(){
        System.out.println("Thread: " + Thread.currentThread().getName() + " State: Dead");
        super.start();
    }
}
public class threadclass {
    public static void main(String[] args) {
        thread1class t1c = new thread1class("thread 1");
        thread1class t2c = new thread1class("thread 2");
        thread1class t3c = new thread1class("thread 3");

        t1c.start();
        t2c.start();
        t3c.start();
    }
}
