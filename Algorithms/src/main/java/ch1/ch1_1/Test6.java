package ch1.ch1_1;

/**
 * @Author: Lance
 * @Date: 2018/7/13 11:24
 */

import ch1.ch1_1.Println;

public class Test6 {

    public static void main(String[] args) {

        int f = 0;
        int g = 1;

        System.out.println('b');
        System.out.println('b' + 'c');
        System.out.println((char) ('a' + 4));

        for (int i = 0; i <= 15; i++) {

            new Println().println(f);
            f = f + g;
            g = f - g;

        }
    }
}
