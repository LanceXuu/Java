package algorithms.排序.快速排序;

/**
 * @Author: Lance
 * @Date: 2018/8/21 16:52
 */
public class QuickSort
{
    public static void main(String[] args)
    {

    }


    public static void sort(int[] arr)
    {
        int num = arr.length;
        int temp = arr[0];

        for (int i = 1; i < num; i++)
        {
            if (less(arr[i], temp))
            {

            }
        }


    }


    public static void change(int[] arr, int i, int j)
    {
        int temp;

        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static boolean less(int i, int j)
    {
        boolean flag = true;

        if (i > j)
        {
            flag = false;
        }


        return flag;
    }

}
