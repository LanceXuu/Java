package 校招.头条.后端第二批.用户喜好;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/8/20 16:50
 */
public class Main
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] hubby = new int[num];

        ArrayList<int[]> arrayList = new ArrayList<>();

        for (int i = 0; i < num; i++)
        {
            hubby[i] = scanner.nextInt();
        }

        //扫描输入查询的组数
        int zuNum = scanner.nextInt();


        while (zuNum > 0)
        {
            int[] lrk = new int[3];

            for (int i = 0; i < 3; i++)
            {
                lrk[i] = scanner.nextInt();
            }

            arrayList.add(lrk);
            zuNum--;
        }

        for (int[] temp : arrayList)
        {
            function(hubby,temp);
        }


    }


    public static void function(int[] hubby, int[] lrk)
    {
        //定义当前范围内喜欢的人数
        int curNum = 0;
        for (int i = lrk[0] - 1; i <= lrk[1] - 1; i++)
        {
            if (hubby[i] == lrk[2])
            {
                curNum++;
            }
        }

        System.out.println(curNum);
    }


}
