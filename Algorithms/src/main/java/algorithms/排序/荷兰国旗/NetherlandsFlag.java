package algorithms.排序.荷兰国旗;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: Lance
 * @Date: 2018/8/13 20:19
 */
public class NetherlandsFlag
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String temp = bufferedReader.readLine();

        int lenth = temp.length();
        String [] arrString = temp.split("");

        int[] arr = new int[lenth];


        for (int i = 0; i < lenth; i++)
        {
            arr[i] = Integer.parseInt(arrString[i]);
        }

        partition(arr,0,lenth-1,5);
        show(arr);

    }


    public static int[] partition(int[] arr, int L, int R, int number)
    {

        int less = L - 1;
        int more = R - 1;
        int cur = L;

        while (cur < more)
        {
            if (arr[cur] < number)
            {
                exch(arr, cur++, ++less);
            }
            else if (arr[cur] > number)
            {
                exch(arr, cur++, --more);
            }
            else
            {
                cur++;
            }
        }

        return new int[]{less + 1, more - 1};

    }

    /**
     * 方法：交换2个数组位置
     *
     * @param a
     * @param i
     * @param j
     */
    private static void exch(int[] a, int i, int j)
    {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }


    private static void show(int[] a)
    {
        //单行打印数组
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i] + " ");
        }

    }
}
