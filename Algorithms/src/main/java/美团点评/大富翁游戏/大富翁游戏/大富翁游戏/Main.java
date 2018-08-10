package 美团点评.大富翁游戏.大富翁游戏.大富翁游戏;

import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/8/10 10:09
 */
public class Main
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext())
        {
            int number = scanner.nextInt();
            System.out.println(getsum(number));
        }


    }

    public static int getsum(int n)
    {
        int count = 0;

        if (n == 1)
        {
            count = 1;
        }
        else if (n == 2)
        {
            count = 2;
        }
        else
        {
            for (int i = 1; i < n; i++)
            {
                count += getsum(n - i);
            }
            count += 1;

        }
        return count;

    }
}
