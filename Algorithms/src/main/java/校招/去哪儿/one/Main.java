package 校招.去哪儿.one;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/9/17 9:24
 */
public class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        String str = bufferedReader.readLine();
//
//        StringBuilder s = new StringBuilder();
//
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext())
//        {
//            s.append(scanner.next());
//        }
//
//        String str = new String(s);


        String[] temp = str.split(" ");
        int[] flag = new int[temp.length];

        for (int i = 0; i <flag.length ; i++)
        {
            flag[i] = Integer.parseInt(temp[i]);
        }


        int cc = maxSum(flag);

        System.out.println(cc);


    }

    public static int maxSum(int[] arraydemo)
    {

        if (arraydemo == null || arraydemo.length == 0)
        {
            return 0;
        }

        int max = Integer.MIN_VALUE;
        int current = 0;
        for (int i = 0; i != arraydemo.length; i++)
        {
            current += arraydemo[i];
            max = Math.max(max, current);
            current = current < 0 ? 0 : current;
        }

        return max;
    }
}
