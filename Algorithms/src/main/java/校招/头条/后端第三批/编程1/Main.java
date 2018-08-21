package 校招.头条.后端第三批.编程1;

import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/8/20 15:39
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numbers = scanner.nextInt();
        int room = scanner.nextInt();

        int[] people = new int[numbers];

        for (int i = 0; i < numbers; i++)
        {
            people[i] = scanner.nextInt();
        }


    }

    public static void function1(int[] people, int room)
    {

        int i = 0;
        while (flag(people))
        {
            people[room - 1 + i++] -= 1;
        }


    }

    /**
     * 判断数组是否有0元素或者是负数元素
     *
     * @param temp
     * @return
     */
    public static boolean flag(int[] temp)
    {
        boolean flag = true;
        for (int i : temp)
        {
            if (i == 0)
            {
                flag = false;
            }
        }
        return false;
    }

    /**
     * 判断数组哪个是0 元素
     */


}
