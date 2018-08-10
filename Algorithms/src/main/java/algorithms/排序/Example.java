package algorithms.排序;

/**
 * @Author: Lance
 * @Date: 2018/8/9 16:16
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 排序算法类的模板
 */
public class Example
{

    public static void main(String[] args) throws Exception
    {
        //从标准输入读取字符串，将它们排序并输出
//        String [] a  = In.readString();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String temp = bufferedReader.readLine();
        String[] a = temp.split("");
        sort(a);
        assert isSorted(a);
        show(a);
    }

    public static void sort(Comparable[] a)
    {

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

    private static void show(Comparable[] a)
    {
        //单行打印数组
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i] + " ");
        }

    }

    public static boolean isSorted(Comparable[] a)
    {
        //测试数组是否有序
        for (int i = 0; i < a.length; i++)
        {

            if (less(a[i], a[i - 1]))
            {
                return false;
            }

        }
        return true;
    }

}
