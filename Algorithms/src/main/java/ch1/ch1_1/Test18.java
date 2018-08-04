package ch1.ch1_1;

/**
 * @Author: Lance
 * @Date: 2018/7/21 16:13
 */
public class Test18 {

    public static void main(String[] args) {

        System.out.println(mystery(2, 25));
        System.out.println(mystery(3, 11));
        System.out.println(mystery(2, 25));

    }

    public static int mystery(int a, int b) {

        if (b == 0) return 0;

        if (b % 2 == 0) return mystery(a + a, b / 2);

        return mystery(a + a, b / 2) + a;

    }

}
