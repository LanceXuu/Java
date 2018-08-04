package ThinkingInJava.ThreadStudy.EctendsThread;

/**
 * @Author: Lance
 * @Date: 2018/7/31 15:02
 */
public class ThreadT extends Thread{

    @Override
    public void run() {
        System.out.println("run..." );
        super.run();
    }
}
