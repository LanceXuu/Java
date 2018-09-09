package 校招.阿里巴巴.ali9_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @Author: Lance
 * @Date: 2018/9/7 19:40
 */
public class Main
{
    public static void main(String[] args)
    {
        int flag = 0;
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];


        for (int i = 0; i < array.length; i++)
        {
            array[i] = scanner.nextInt();
        }

        if (function(array, 0))
        {
            System.out.println(0);
        } else
        {
            //
        }

        for (int i = 3; i <= array.length; i++)
        {
            Object[] subArray = splitAry(array, i);
            for (Object obj : subArray)
            {
                int[] aryItem = (int[]) obj;
                if (function(aryItem, 0))
                {
                    if (dengCha(array))
                    {
                        flag++;
                    }
                }
            }
        }

        System.out.println(flag);


    }

    //判断一个数组是否递增
    private static boolean function(int[] array, int begin)
    {
        if (begin == array.length - 1)
        {
            return true;
        } else
        {
            return array[begin] < array[begin + 1] && function(array, begin + 1);
        }
    }


    //剪切一个数组
    private static Object[] splitAry(int[] ary, int subSize)
    {
        int count = ary.length % subSize == 0 ? ary.length / subSize : ary.length / subSize + 1;

        List<List<Integer>> subAryList = new ArrayList<List<Integer>>();

        for (int i = 0; i < count; i++)
        {
            int index = i * subSize;
            List<Integer> list = new ArrayList<Integer>();
            int j = 0;
            while (j < subSize && index < ary.length)
            {
                list.add(ary[index++]);
                j++;
            }
            subAryList.add(list);
        }

        Object[] subAry = new Object[subAryList.size()];

        for (int i = 0; i < subAryList.size(); i++)
        {
            List<Integer> subList = subAryList.get(i);
            int[] subAryItem = new int[subList.size()];
            for (int j = 0; j < subList.size(); j++)
            {
                subAryItem[j] = subList.get(j).intValue();
            }
            subAry[i] = subAryItem;
        }

        return subAry;
    }


    //判断数组是否为等差
    public static boolean dengCha(int[] temp)
    {
        boolean flag = false;

        TreeSet<Integer> ts = new TreeSet<Integer>();

        int b = 0;

        for (int z = 0; z < temp.length - 1; z++)
        {


            b = temp[z + 1] - temp[z];

            ts.add(b);

        }

// 判断Set数组里是否只有一个值，若是则是等差数组，反之同理

        if (ts.size() == 1)
        {

            flag = true;

        }


        return flag;
    }
}

