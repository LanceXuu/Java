package ch1.ch1_1;

/**
 * @Author: Lance
 * @Date: 2018/7/18 17:08
 */
public class TestProgramArguments {

    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);
        System.out.println(args[4]);
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < 10; i++) {
            i1++;
            i2 = i2 + i1;
        }
        System.out.println("i1: " + i1 + " i2: " + i2);
    }
}
