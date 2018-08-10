package algorithms.排序.插入排序;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: Lance
 * @Date: 2018/8/7 10:44
 */
public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String temp = bufferedReader.readLine();

        String[] arrString = temp.split(" ");
        int[] arr = new int[arrString.length + 1];

        //把String数组转成int数组
        for (int i = 0; i < arrString.length; i++) {
            arr[i + 1] = Integer.parseInt(arrString[i]);
        }

        Main main = new Main();

        int[] arrTest = main.insertSort(arr);
        main.print(arrTest);


    }


    public int[] insertSort(int[] arr) {

        if (arr.length == 1 && arr.length == 2) {
            return null;
        }
        for (int i = 1; i < arr.length; i++) {

            //以下一行代码可以理解为，我扣了i张牌，第i张牌和前i-1张牌依次对比
            for (int j = i - 1; arr[j] >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }

        }
        return arr;

    }

    public void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
