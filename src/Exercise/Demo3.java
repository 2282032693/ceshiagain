package Exercise;

public class Demo3 {
    public static void main(String[] args) {
        SubRunnable sr = new SubRunnable();
        Thread thread = new Thread(sr);
        thread.start();
        for (int i = 0; i < 50; i++) {
            System.out.println("main---------"+i);
        }
    }
}
