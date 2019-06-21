package Exercise;

public class Demo4 {
    public static void main(String[] args) {
        new Thread(){
            public void run(){
                System.out.println("!!!!!");
            }
        }.start();
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("rrrrrrrr");
            }
        };
        new Thread(r).start();
    }
}
