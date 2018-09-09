package 校招.携程.one;

import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/9/4 19:27
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext())
        {
            Long n = scanner.nextLong();
            int count = 0;
            while (n != 0)
            {
                count++;
                n = n & (n - 1);
            }
            System.out.println(count);


        }
    }
}




