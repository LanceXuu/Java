//package ThinkingInJava.InnerClass;
//
//import static sun.misc.Version.print;
//
///**
// * @Author: Lance
// * @Date: 2018/8/1 16:34
// */
//public class InnerThread1
//{
//    private int countDown = 5;
//    private Inner inner;
//
//    /**
//     * 写内部类继承Thread类
//     */
//    class Inner extends Thread
//    {
//        Inner(String name)
//        {
//            super(name);
//            start();
//        }
//        @Override
//        public void run()
//        {
//            super.run();
//            try
//            {
//                while(true)
//                {
//                    print(this);
//                    if(--countDown == 0) return;
//                    sleep(10);
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        @Override
//        public String toString()
//        {
//            return getName() + ": " + countDown;
//        }
//    }
//    public InnerThread1 (String name)
//    {
//        inner = new Inner(name);
//    }
//}
