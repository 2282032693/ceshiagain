package Exercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test5 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(new ThreadPoll());
        es.submit(new ThreadPoll());
    }
}
