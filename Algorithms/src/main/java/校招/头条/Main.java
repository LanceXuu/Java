package 校招.头条;

import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/8/13 10:26
 */
public class Main
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            int number = scanner.nextInt();


            int[] flag = new int[number];

            for (int i = 0; i < number; i++)
            {
                flag[i] = scanner.nextInt();
            }

            int num = scanner.nextInt();

            for (int i = 0; i < num; i++)
            {
                int sum = 0;

                int[] input = new int[3];

                for (int j = 0; j < 3; j++)
                {
                    input[j] = scanner.nextInt();
                }

                for (int j = input[0]; j <= input[1]; j++)
                {
                    if (flag[j - 1] == input[2])
                    {
                        sum++;
                    }
                }
                System.out.println(sum);
            }


        }
    }


}
