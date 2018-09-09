package 校招.头条.九月九号.two;

import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/9/9 10:18
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String ip = scanner.next();

        int num = ip.length();
        int flag = 1;

        if (num == 4)
        {
            System.out.println(flag);
        } else
        {
            flag = combination(num - 1, 3);
            flag = getCountOfCombinations(num - 1, 3);
            System.out.println(flag);

        }


    }

    /**
     * 组合计算公式C<sup>m</sup><sub>n</sub> = n! / (m! * (n - m)!)
     *
     * @param m
     * @param n
     * @return
     */
    public static int combination(int m, int n)
    {
        return m <= n ? factorial(n) / (factorial(m) * factorial((n - m))) : 0;
    }

    private static int factorial(int n)
    {
        int sum = 1;
        while (n > 0)
        {
            sum = sum * n--;
        }
        return sum;
    }


    static int getCountOfCombinations(int arrLen, int len)
    {//获取长度为len的组合数
        int m = 1;
        for (int i = 0; i != len; i++)
        {
            m *= arrLen - i;
        }
        int n = 1;
        for (int i = len; i != 1; i--)
        {
            n *= i;
        }
        return m / n;
    }


}
