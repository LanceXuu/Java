package ThinkingInJava.ThreadStudy.DeadLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: Lance
 * @Date: 2018/8/1 14:49
 */
public class ThreadTask implements Runnable
{
    private int tickets = 100;
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {

        while(true)
        {
            lock.lock();
            if(tickets != 0)
            {
                System.out.println(Thread.currentThread().getName() + "正在售票，且仅剩下" +  tickets + "张票了");
                tickets--;
            }
            lock.unlock();
        }
    }
}
