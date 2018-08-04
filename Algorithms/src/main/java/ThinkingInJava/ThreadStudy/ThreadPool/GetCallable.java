package ThinkingInJava.ThreadStudy.ThreadPool;

import java.util.concurrent.Callable;

/**
 * @Author: Lance
 * @Date: 2018/7/31 15:31
 */
public class GetCallable implements Callable<Integer> {

    private int a;

    public GetCallable(int a){
        this.a = a;
    }

    @Override
    public Integer call(){
        int sum = 0;

        for (int i = 0; i < a; i++) {
            sum = sum + a;
        }
        return sum;
    }
}
