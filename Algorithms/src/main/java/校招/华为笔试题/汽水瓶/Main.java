package 校招.华为笔试题.汽水瓶;

import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/8/7 15:42
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int flag = scanner.nextInt();
            if (flag == 0) {
                break;
            } else {
                System.out.println(coutBottle(flag));
            }

        }
    }

    public static int coutBottle(int i) {

        if (i == 1) {
            return 1;
        }
        if (i % 2 != 0) {
            return (i - 1) / 2;
        } else {
            return i / 2;
        }


    }
}
