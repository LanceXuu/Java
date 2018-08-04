package ThinkingInJava.ThreadStudy.DeadLock;

/**
 * @Author: Lance
 * @Date: 2018/8/1 14:54
 */
public class ThreadTest {

    public static void main(String[] args) {

        ThreadTask threadTask = new ThreadTask();

        Thread thread   = new Thread( threadTask, "一号窗口");
        Thread thread2  = new Thread( threadTask, "二号窗口");
        Thread thread3  = new Thread( threadTask, "三号窗口");

        thread. start();
        thread2.start();
        thread3.start();

    }
}
