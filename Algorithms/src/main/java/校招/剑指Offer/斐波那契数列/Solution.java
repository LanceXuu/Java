package 校招.剑指Offer.斐波那契数列;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/9/3 11:03
 */
public class Solution
{


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Solution solution = new Solution();
        int temp = solution.Fibonacci(n);

        System.out.println(temp);


    }

    public int Fibonacci(int n)
    {
        int temp = function(n);


        return temp;
    }


    public static int function(int n)
    {
        int flag;

        if (n == 0)
        {
            return 0;
        } else if (n == 1)
        {
            return 1;
        } else if (n == 2)
        {
            return 1;
        }

        flag = function(n - 1) + function(n - 2);


        return flag;
    }
}
