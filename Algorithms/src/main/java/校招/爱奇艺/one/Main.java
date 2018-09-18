package 校招.爱奇艺.one;

import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/9/15 11:00
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.next();

        String[] flag = temp.split("");
        int[] target = new int[flag.length];

        for (int i = 0; i < flag.length; i++)
        {
            target[i] = Integer.parseInt(flag[i]);
        }

        int he1 = target[0] + target[1] + target[2];
        int he2 = target[3] + target[4] + target[5];

        if (he1 == he2)
        {
            System.out.println(0);
        } else
        {
            if (he2 < 9 - he1)
            {
                System.out.println(1);
            } else if (he2 > 9 - he1 && he2 <= 18 - he1)
            {
                System.out.println(2);
            } else if (he2 > 18 - he1 && he2 <= 27 - he1)
            {
                System.out.println(3);
            }
        }
    }
}
