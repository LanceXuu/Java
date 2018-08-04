package ThinkingInJava.ThreadStudy.ThreadSafe;

import java.util.concurrent.Callable;

/**
 * @Author: Lance
 * @Date: 2018/7/31 16:42
 */
public class ThreadDemo02 implements Callable<Integer> {
    private Object object = new Object();
    private int tickets ;

    public ThreadDemo02(int tickets){
        this.tickets = tickets;
    }

    @Override
    public Integer call() {
        while (true) {
            synchronized (object) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "Pool还剩电影票： " + tickets--);
                }
            }
            return null;
        }
    }
}
