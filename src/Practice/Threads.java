package Practice;

public class Threads {
    public static void main(String[] args) {
        //using labda
        Thread thread1 = new Thread(()->{
            for (int i = 0;i < 10 ; i++)
                System.out.println("labda Thread");
        });
        //using runnable class
        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);

        //using thread class
        Thread thread3 = new MyThread();

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0;i < 10 ; i++)
            System.out.println("runnable Thread");
    }
}
class MyThread extends Thread{
    public void run(){
        for (int i = 0;i < 10 ; i++) {
            System.out.println("Thread class");
            if (i == 5) {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
