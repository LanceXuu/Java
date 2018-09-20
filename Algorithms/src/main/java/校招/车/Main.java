package 校招.车;

import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/9/19 22:58
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext())
        {
            int min = 21;

            int[] a = new int[11000];

            String s = scanner.nextLine();

            for (int i = 0; i < s.length(); i++)
            {
                int x = s.charAt(i);
                a[x]++;
            }

            for (int i = 0; i < s.length(); i++)
            {
                int x = s.charAt(i);
                if (a[x] < min)
                {
                    min = a[x];
                }
            }

            for (int i = 0; i < s.length(); i++)
            {
                int x = s.charAt(i);
                if (a[x] != min)
                {
                    System.out.print(s.charAt(i));
                }
            }
            System.out.println();

        }
    }
}

