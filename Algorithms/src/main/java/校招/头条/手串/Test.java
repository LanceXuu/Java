package 校招.头条.手串;

/**
 * @Author: Lance
 * @Date: 2018/8/23 11:04
 */

import java.util.*;

public class Test
{


    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    //n个串珠
        int m = sc.nextInt();    //手串上的任意一种颜色（不包含无色），在任意连续的m个串珠里至多出现一次
        int c = sc.nextInt();    //颜色一共有c种
        int count = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++)
        {
            int num = sc.nextInt();
            for (int j = 0; j < num; j++)
            {
                int key = sc.nextInt();
                if (!map.containsKey(key))
                {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    map.put(key, list);
                }
                else
                {
                    List<Integer> list = map.get(key);
                    list.add(i);
                }
            }
        }
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
                    if ((n - list.get(list.size() - 1) + list.get(0)) < m)
                    {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }

}

