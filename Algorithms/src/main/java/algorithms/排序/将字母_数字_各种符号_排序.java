package algorithms.排序;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/8/13 9:44
 */
public class 将字母_数字_各种符号_排序
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext())
        {
            String temp = scanner.next();

            String[] flag = temp.split("");

            sort(flag);
        }
    }

    public static void sort(String[] flag)
    {
        Arrays.sort(flag);
        System.out.println(Arrays.toString(flag));

    }
}
