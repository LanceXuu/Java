package 校招.头条.后端第二批.用户喜好.网友;

/**
 * @Author: Lance
 * @Date: 2018/8/25 13:52
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; ++i)
        {
            arr[i] = cin.nextInt();
        }
        int t = cin.nextInt();
        int count = 0;
        for (int i = 0; i < t; ++i)
        {
            count = 0;
            int[] temp = new int[3];
            for (int j = 0; j < 3; ++j)
            {
                temp[j] = cin.nextInt();
            }
            for (int j = temp[0] - 1; j <= temp[1] - 1; ++j)
            {
                if (arr[j] == temp[2])
                {
                    ++count;
                }
            }
            System.out.println(count);
        }
        cin.close();
    }
}