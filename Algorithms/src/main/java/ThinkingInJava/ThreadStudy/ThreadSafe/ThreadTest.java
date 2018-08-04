package ThinkingInJava.ThreadStudy.ThreadSafe;

/**
 * @Author: Lance
 * @Date: 2018/7/31 16:34
 */
public class ThreadTest {

    public static void main(String[] args) {

        ThreadDemo threadDemo = new ThreadDemo();

        Thread thread01 = new Thread(threadDemo, "一号售票窗口");
        Thread thread02 = new Thread(threadDemo, "二号售票窗口");
        Thread thread03 = new Thread(threadDemo, "三号售票窗口");

        thread01.start();
        thread02.start();
        thread03.start();

    }
}
