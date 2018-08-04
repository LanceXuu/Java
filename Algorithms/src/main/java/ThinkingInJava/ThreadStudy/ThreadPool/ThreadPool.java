package ThinkingInJava.ThreadStudy.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Author: Lance
 * @Date: 2018/7/31 15:28
 */
public class ThreadPool {

    public static void main(String[] args) throws Exception {

        //创建一个线程为2的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        //调用该线程池的submit方法，该方法会接受Callable的实现类
        Future<Integer> futureGet100 = executorService.submit(new GetCallable(100));
        Future<Integer> futureGet200 = executorService.submit(new GetCallable(200));

        System.out.println(futureGet100.get());
        System.out.println(futureGet200.get());

        executorService.shutdown();

    }
}
