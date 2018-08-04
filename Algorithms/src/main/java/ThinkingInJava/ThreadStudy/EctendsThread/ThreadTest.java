package ThinkingInJava.ThreadStudy.EctendsThread;

/**
 * @Author: Lance
 * @Date: 2018/7/31 15:01
 */
public class ThreadTest {

    //主线程
    public static void main(String[] args) {
        System.out.println("mainThread...");
        ThreadT threadT = new ThreadT();
        threadT.start();
    }




}
