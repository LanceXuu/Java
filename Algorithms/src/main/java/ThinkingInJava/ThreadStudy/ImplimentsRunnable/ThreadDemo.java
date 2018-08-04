package ThinkingInJava.ThreadStudy.ImplimentsRunnable;

/**
 * @Author: Lance
 * @Date: 2018/7/31 15:07
 */
public class ThreadDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("实现多线程接口...");
    }
}
