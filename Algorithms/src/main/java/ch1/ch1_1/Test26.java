package ch1.ch1_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: Lance
 * @Date: 2018/8/7 9:39
 */

/**
 * 方法：输入三个数并按照从小到大排序输出
 * 参数：null
 * 返回：void
 */
public class Test26 {

    public static void main(String[] args) throws Exception{

        new Test26().sequence();
    }

    public void sequence() throws Exception {

        //输入三个数
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String temp = bufferedReader.readLine();
        String[] flag = temp.split(" ");

        int a = Integer.parseInt(flag[0]);
        int b = Integer.parseInt(flag[1]);
        int c = Integer.parseInt(flag[2]);

        if (a > b) {
            int t;
            t = a;
            a = b;
            b = t;
        }

        if (a > c) {
            int t;
            t = a;
            a = c;
            c = t;
        }

        if (b > c) {
            int t;
            t = b;
            b = c;
            c = t;
        }

        System.out.println("a、b、c的大小排序为：" + a + " " + b + " " + c);


    }
}
