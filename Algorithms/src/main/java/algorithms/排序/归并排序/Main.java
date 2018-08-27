package algorithms.排序.归并排序;

/**
 * @Author: Lance
 * @Date: 2018/8/21 15:34
 */
public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};


    }

    public static void sort()
    {

    }


    /**
     * 交换数组2个元素的位置
     *
     * @param arr
     * @param i
     * @param j
     */
    private static void change(int[] arr, int i, int j)
    {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
