package algorithms.排序.冒泡排序;

/**
 * @Author: Lance
 * @Date: 2018/8/16 10:30
 */
public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] numbers = {1, 6, 3, 4, 5, 6, 7, 2, 8, 99, 44};
        sort(numbers);
        show(numbers);
    }

    public static void sort(int[] numbers)
    {
        int k = numbers.length;

        for (int i = 0; i < k - 1; i++)
        {
            for (int j = 0; j < k - 2; j++)
            {
                if (numbers[k - 1 - j] < numbers[k - 2 - j])
                {
                    change(numbers, k - 1 - j, k - 2 - j);

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

    /**
     * 变换2个元素位置
     *
     * @param i
     * @param j
     */
    private static void change(int[] numbers, int i, int j)
    {
        int temp;
        temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }


}
