package ThinkingInJava;

public class Task implements Runnable {

    public static void main(String[] args){
        Thread t = new Thread(new Task());
        t.start();
        System.out.println("Waiting for Task");
    }


    protected int countDown = 10;
    private static int taskCount = 0 ;
    private final int id = taskCount++;
    public Task(){}
    public Task(int countDown){
        this.countDown = countDown;
    }
    public String status(){
        return "#"+id+"("+(countDown>0?countDown:"Task!")+").    ";
    }
    @Override
    public void run() {
        while(countDown-->0){
            System.out.print(status());
            Thread.yield();
        }
    }
}
