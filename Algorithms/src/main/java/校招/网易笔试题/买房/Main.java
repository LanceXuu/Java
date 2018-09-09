package 校招.网易笔试题.买房;

/**
 * @Author: Lance
 * @Date: 2018/9/8 16:02
 */
//package 校招.网易笔试题.橡皮泥斑马;

//import java.util.Scanner;

import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/9/8 15:43
 */
public class Main
{
    public static void main(String[] args)
    {

        int min = 0;
        int max = 0;

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++)
        {
            int[] temp = new int[2];

            temp[0] = scanner.nextInt();
            temp[1] = scanner.nextInt();

            if (temp[1] == 0)
            {
                min = 0;
                max = 0;
                System.out.println(min + " " + max);


            } else if (temp[1] == temp[0])
            {
                min = 0;
                max = 0;
                System.out.println(min + " " + max);
            } else if (temp[0] > temp[1])
            {
                if (temp[1] > 2)
                {
                    int temp1 = temp[0] - temp[1];
                    if (temp1 >= temp[1] - 1)
                    {
                        max = temp[1] - 1;

                    } else
                    {
                        max = temp1;
                    }

                }

                System.out.println(min + " " + max);

            }

        }


    }
}

