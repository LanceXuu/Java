package ThinkingInJava.ThreadStudy.ImplimentsRunnable;

/**
 * @Author: Lance
 * @Date: 2018/7/31 15:08
 */
public class ThreadTest {

    public static void main(String[] args) {
        System.out.println("mainThread...");
        Thread thread = new Thread(new ThreadDemo());
        thread.start();
    }
}
