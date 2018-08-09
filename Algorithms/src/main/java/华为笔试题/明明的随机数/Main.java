package 华为笔试题.明明的随机数;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/8/7 16:03
 */
public class Main
{

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNext())
        {

            int temp = scanner.nextInt();
            int[] newArr = new int[temp + 1];


            for (int i = 1; i <= temp; i++)
            {
                newArr[i] = scanner.nextInt();

            }

            Main test = new Main();
//            int[] newArr = test.insertSort(flag);

            Arrays.sort(newArr);
            for (int i = 1; i < newArr.length; i++)
            {
                if (newArr[i] == newArr[i - 1])
                {
                    continue;
                }
                System.out.println(newArr[i]);
            }


        }

        //创建对象实现方法

    }

    public int[] insertSort(int[] arr)
    {

        if (arr.length == 1 && arr.length == 2)
        {
            return null;
        }
        for (int i = 1; i < arr.length; i++)
        {

            //以下一行代码可以理解为，我扣了i张牌，第i张牌和前i-1张牌依次对比
            for (int j = i - 1; arr[j] >= 0 && arr[j] > arr[j + 1]; j--)
            {
                swap(arr, j, j + 1);
            }

        }
        return arr;

    }

    public void swap(int[] arr, int i, int j)
    {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    /**
     * 删除数组中多余的元素
     *
     * @param arr
     * @return
     */
    public int[] removeDuplicates(int[] arr)
    {

        int cout = 0;

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] == arr[j])
                {
                    cout++;
                    break;
                }
            }
        }

        int lenth = arr.length - cout;
        int[] newArr = new int[lenth];

        if (arr.length == 1)
        {
            return arr;
        }

        int index = 1;
        newArr[0] = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] != arr[i - 1])
            {
                newArr[index++] = arr[i];
            }
        }
        return newArr;


    }
}
