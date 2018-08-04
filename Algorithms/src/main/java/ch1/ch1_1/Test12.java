package ch1.ch1_1;

/**
 * @Author: Lance
 * @Date: 2018/7/13 15:04
 */
public class Test12 {

    public static void main(String[] args) {
        if (System.getProperty("os.name").toLowerCase().indexOf("window") > -1) {
            String a = "\"a\"";
            System.out.println(a);
        }
        System.out.println(System.getProperty("os.name"));
        int[] a = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
            System.out.println(a[i]);
        }

        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
            System.out.println(a[i]);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

    }
}
