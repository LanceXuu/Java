package 校招.网易笔试题.丰收;

import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/8/14 20:38
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext())
        {
            int number = scanner.nextInt();
            int[] numberIndex = new int[number];


            for (int i = 0; i < number; i++)
            {
                numberIndex[i] = scanner.nextInt();
            }

            int questionNum = scanner.nextInt();

            for (int i = 0; i < questionNum; i++)
            {
                int test = scanner.nextInt();
                function(numberIndex, test);
            }
        }


    }

    /**
     * 能很好的学习到continue和break的用法
     * @param numberIndex
     * @param test
     */
    public static void function(int[] numberIndex, int test)
    {
        int count = 0;
        for (int i = 0; i < numberIndex.length; i++)
        {
            count += numberIndex[i];
            if (test > count)
            {
                continue;
            }

            System.out.println(i + 1);
            break;

        }

    }
}
