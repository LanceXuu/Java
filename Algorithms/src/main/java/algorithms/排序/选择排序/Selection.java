package algorithms.排序.选择排序;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: Lance
 * @Date: 2018/8/9 16:37
 */
public class Selection
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String temp = bufferedReader.readLine();

        Comparable[] a = temp.split("");

        sort(a);
        System.out.println(a[0]);

        for (int i = 1; i < a.length; i++)
        {
            if (a[i].compareTo(a[i - 1]) == 0)
            {
                continue;
            }
            System.out.println(a[i]);


        }

    }

    public static void sort(Comparable[] a)
    {
        int lenth = a.length;
        for (int i = 0; i < lenth; i++)
        {
            int min = i;
            for (int j = i + 1; j < lenth; j++)
            {
                if (less(a[j], a[min]))
                {
                    min = j;
                    exch(a, i, min);
                }
            }
        }
    }

    public static boolean less(Comparable v, Comparable w)
    {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j)
    {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
