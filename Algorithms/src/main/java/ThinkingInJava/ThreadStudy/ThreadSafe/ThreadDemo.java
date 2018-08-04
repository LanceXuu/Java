package ThinkingInJava.ThreadStudy.ThreadSafe;

/**
 * @Author: Lance
 * @Date: 2018/7/31 16:31
 */
public class ThreadDemo implements Runnable{
    private int tickets = 100;
    private Object object = new Object();

    @Override
    public void run()
    {
        while(true)
        {

            //给运行的部分加锁 ，防止一个进程尚未结束， 就被抢占了内存
          synchronized (object) {
              if (tickets > 0) {
                  try {
                      Thread.sleep(10);
                  } catch (Exception e) {
                      e.printStackTrace();
                  }
                  System.out.println(Thread.currentThread().getName() + "还剩电影票： " + tickets--);
              }
          }

        }
    }




}
