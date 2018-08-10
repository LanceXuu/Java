package algorithms.排序.插入排序;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: Lance
 * @Date: 2018/8/10 11:10
 */
public class Insertion
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String temp = bufferedReader.readLine();

        Comparable[] a = temp.split("");

        sort(a);

        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }

    }

    public static void sort(Comparable[] a)
    {
        int lenth = a.length;
        //把a[i]插入到a[i-1],a[i-2],a[i-3],a[i-4]...之中
        for (int i = 1; i < lenth; i++)
        {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--)
            {
                exch(a, j, j - 1);
            }
        }


    }

    /**
     * 交换数组2个元素的位置
     *
     * @param a
     * @param i
     * @param j
     */


    public static void exch(Comparable[] a, int i, int j)
    {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    /**
     * 比较2个元素，如果左边小于右边则返回true
     *
     * @param i
     * @param j
     * @return
     */


    public static boolean less(Comparable i, Comparable j)
    {
        if (i.compareTo(j) < 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
