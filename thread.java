class threadd implements Runnable{
    public String threadname;
    threadd(String name){
        threadname = name;
        System.out.println("Thread " + threadname + " State: new");
    }

    public void run(){
        System.out.println("Thread " + threadname + "State: running");
        for (int i = 4; i > 0; i--) {
            System.out.println("Thread " + threadname + ", " + i);
        }
        System.out.println("Thread " + threadname + "State: dead");
    }
}

public class thread {

    public static void main(String[] args) {
        threadd t1 = new threadd("Thread 1");
        threadd t2 = new threadd("Thread 2");

        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        th1.start();
        th2.start();
    }
}