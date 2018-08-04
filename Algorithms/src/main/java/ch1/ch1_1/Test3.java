package ch1.ch1_1;

import java.util.Scanner;
import ch1.ch1_1.Println;

/**
 * @Author: Lance
 * @Date: 2018/7/13 10:47
 */
public class Test3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a, b, c;
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            if (a == b && a == c) {
                System.out.println("equal");
            } else {
                System.out.println("not equal");
            }
            break;
        }

    }
}
