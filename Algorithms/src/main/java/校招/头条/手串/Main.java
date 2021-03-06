package 校招.头条.手串;

import java.util.*;

/**
 * @Author: Lance
 * @Date: 2018/8/23 15:01
 */

/**
 * 思路：
 * 1. 相同的颜色不能连续的出现在相邻的串珠，//考虑到串珠是环形的
 * 2. 那么，我们设置map---KEY：key为颜色
 * Value：为list--list存储颜色出现在哪里
 * 3. 遍历list，比较list相邻间的值（为什么比较相邻间的值，因为要求是任一颜色连续m个串珠至多一次），
 * 是否小于m；
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int c = scanner.nextInt();

        Map<Integer, List<Integer>> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < n; i++)
        {
            int colorNumbers = scanner.nextInt();

            if (colorNumbers == 0)
            {
                continue;
            }
            for (int j = 1; j <= colorNumbers; j++)
            {
                int key = scanner.nextInt();

                if (!map.containsKey(key))
                {
                    List<Integer> list = new LinkedList();
                    list.add(i);
                    map.put(key, list);

                }
                else
                {
                    List<Integer> list = map.get(key);
                    list.add(i);
                    map.put(key, list);
                }
            }
        }

        //开始对比
        for (int i = 1; i <= c; i++)
        {
            boolean flag = false;
            List<Integer> list = map.get(i);

            if (list.size() == 1)
            {
                continue;
            }
            else
            {
                for (int j = 0; j < list.size() - 1; j++)
                {

                    if (list.get(j + 1) - list.get(j) < m)
                    {
                        count++;
                        flag = true;
                        break;
                    }
                }

                if (!flag)
                {
                    if (n - list.get(list.size() - 1) + list.get(0) < m)
                    {
                        count++;
                    }
                }
            }


        }


        System.out.println(count);
    }
}
