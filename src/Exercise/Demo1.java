package Exercise;

public class Demo1 {
    public static void main(String[] args) {
        SubThread st = new SubThread();
        st.start();
        for (int i = 0; i < 50; i++) {
            System.out.println("main-----------" + i);
        }
    }
}
