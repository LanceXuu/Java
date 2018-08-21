package 校招.头条.手串;

/**
 * @Author: Lance
 * @Date: 2018/8/20 20:13
 */

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;


public class Main
{


    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        // n个手串
        int n = scanner.nextInt();
        // 间隔为m
        int m = scanner.nextInt();
        // 有c种颜色
        int c = scanner.nextInt();

        Map<Integer, LinkedList<Integer>> map = new HashMap<Integer, LinkedList<Integer>>();

        for (int i = 1; i <= c; i++)
        {

            map.put(i, new LinkedList<Integer>());

        }

        int total = 1;

        while (total <= n)
        {
            // 表示有多少顔色
            int num = scanner.nextInt();

            for (int i = 0; i < num; i++)
            {

                int color = scanner.nextInt();

                // 得到某種顔色的位置
                LinkedList<Integer> linkedList = map.get(color);

                // 再加上此位置
                linkedList.add(total);

                map.put(color, linkedList);

            }

            total++;

        }

        int error = 0;

        for (int i = 1; i <= c; i++)
        {

            // 得到某種顔色的位置
            LinkedList<Integer> linkedList = map.get(i);

            int[] array = new int[linkedList.size()];

            int k = 0;

            for (int j : linkedList)
            {

                array[k++] = j;

            }

            for (int j = 0; j < array.length; j++)
            {

                if (j + 1 < array.length && array[j + 1] - array[j] < m)
                {

                    error++;

                    break;

                }
                else if (j + 1 == array.length && array[0] + n - array[j] < m)
                {
                    error++;
                    break;

                }

            }

        }

        System.out.println(error);

    }

}
