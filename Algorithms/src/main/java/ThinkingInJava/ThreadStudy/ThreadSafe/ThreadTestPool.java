package ThinkingInJava.ThreadStudy.ThreadSafe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.concurrent.Executors.newFixedThreadPool;

/**
 * @Author: Lance
 * @Date: 2018/7/31 16:45
 */
public class ThreadTestPool {

    public static void main(String[] args) {
        ExecutorService executorService =  Executors.newFixedThreadPool(2);

        executorService.submit(new ThreadDemo02(100));
        executorService.submit(new ThreadDemo02(100));
        executorService.submit(new ThreadDemo02(100));

        executorService.shutdown();

    }
}
