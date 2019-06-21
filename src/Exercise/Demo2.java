package Exercise;

public class Demo2 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 6; i++) {
            Thread.sleep(1000L);
            System.out.println(i);
        }
    }
}
