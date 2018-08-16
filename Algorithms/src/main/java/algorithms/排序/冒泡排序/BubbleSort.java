package algorithms.排序.冒泡排序;

/**
 * @Author: Lance
 * @Date: 2018/8/16 10:30
 */
public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] numbers = {1, 6, 3, 4, 5};
        sort(numbers);
        show(numbers);
    }

    public static void sort(int[] numbers)
    {
        int temp = 0;
        int size = numbers.length;
        for (int i = 0; i < size - 1; i++)
        {
            for (int j = 0; j < size - 1 - i; j++)
            {
                if (numbers[j] > numbers[j + 1])  //交换两数位置
                {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    /**
     * @param v
     * @param w
     * @return
     */
    private static boolean less(Comparable v, Comparable w)
    {
        return v.compareTo(w) < 0;
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

    private static void show(int[] a)
    {
        //单行打印数组
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i] + " ");
        }

    }


}
