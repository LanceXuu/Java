package 华为笔试题.小偷偷东西;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/8/8 19:40
 */
public class Main
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            String str1 = scanner.next();
            String str2 = scanner.next();

            String[] temp1 = str1.split(",");
            String[] temp2 = str2.split(",");


            int lenth = temp1.length;
            int[] a = new int[lenth];
            int[] b = new int[lenth];


            for (int i = 0; i < lenth; i++)
            {
                a[i] = Integer.parseInt(temp1[i]);
                b[i] = Integer.parseInt(temp2[i]);
            }


            int number = scanner.nextInt();
            best(a, b, number);


        }
    }

    public static void best(int[] a, int[] b, int number)
    {
        int temp = 0;
        int value = 0;
        List<Integer> list = new LinkedList<Integer>();


        for (int j = 0; j < b.length; j++)
        {
//            value = value + a[j];
            for (int i = j; i < b.length; i++)
            {

                    int weight = (temp = temp + b[i]);

                    value = value + a[i];
                    if (weight <= number)
                    {
                        list.add(value);
                    }
                    else
                    {
                        value -= a[i];
                    }



            }
        }

        System.out.println(Collections.max(list));
    }

    //任意个数的和
//    public static boolean best(int[] b, int[] a, int num)
//    {
//        boolean flag = false;
//        List strList = new ArrayList();
//        int value = 0;
//        for (int i = 0; i < a.length; i++)
//        {
//            int all = i;
//            String str = i + ",";
//            value += a[i];
//
//            for (int j = 0; j < b.length; j++)
//            {
//                all += j;
//                str += j + ",";
//                value += a[j];
//
//                if (all <= num)
//                {
//                    strList.add(value);
//                }
//            }
//        }
//    }
}
