package Exercise;

public class ThreadPoll implements Runnable {
    @Override
    public void run() {
        System.out.println(new Thread().currentThread().getName()+"run方法");
    }
}
