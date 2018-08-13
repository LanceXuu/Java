package algorithms.排序.归并排序;

import java.io.BufferedReader;
import java.io.InputStreamReader;



/**
 * @Author: Lance
 * @Date: 2018/8/13 14:27
 */
public class Merge
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String temp = bufferedReader.readLine();

        Comparable[] a = temp.split("");

        sort(a);

    }

    //原地归并排序算法
    public static void merge(Comparable[] a, int low, int mid, int high, Comparable[] aux)
    {
        //将a[low , mid ] a[mid + 1 , high]归并
        int i = low, j = mid + 1;
        aux = new Comparable[high - low + 1];


        for (int k = low; k < high; k++)
        {
            aux[k] = a[k];
        }


        for (int k = low; k < high; k++)
        {
            if (i > mid)
            {
                a[k] = aux[j++];
            }
            else if (j > high)
            {
                a[k] = aux[i++];
            }
            else if (less(aux[j], aux[i]))
            {
                a[k] = aux[j++];
            }
            else
            {
                a[k] = aux[i++];
            }


        }
    }

    public static void sort(Comparable[] a)
    {
        int length = a.length;
        Comparable[] aux = new Comparable[length];

        sort(a, 0, length - 1, aux);

    }


    private static void sort(Comparable[] a, int lo, int hi, Comparable[] aux)
    {
        if (hi <= lo)
        {
            return;
        }

        int mid = lo + (lo + hi) / 2;

        sort(a, lo, mid, aux);
        sort(a, mid + 1, hi, aux);
        merge(a, lo, mid, hi, aux);


    }

    private static boolean less(Comparable v, Comparable w)
    {
        return v.compareTo(w) < 0;
    }

    /**
     * 交换2个数组2个位置的值
     */
    private static void exch(Comparable[] a, int i, int j)
    {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }


    /**
     * 逐行打印出数组a 的值
     */

    public static void show(Comparable[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }


    }


}
