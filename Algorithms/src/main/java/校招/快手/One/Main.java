package 校招.快手.One;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/9/10 18:50
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        boolean qqqq = true;
        String temp2 = scanner.next();
        String temp = sort(temp2);

        List<String> list = new ArrayList<>();

        StringBuffer stringBuffer = new StringBuffer();

        String[] flag = temp.split("");
        for (int i = 0; i < flag.length; i++)
        {

            int count = 0;
            String temp1 = flag[i];

            int oo = 0;
            qqqq= fun(list,temp1);

            if (qqqq)
            {
                continue;
            }
            list.add(temp1);

//            if (function(flag, temp1))
//            {
//                continue;
//            }


            for (int j = 0; j < flag.length; j++)
            {
                if (temp1.equals(flag[j]))
                {

                    count++;
                }

            }
            stringBuffer.append(temp1 + count);

        }
        System.out.println(stringBuffer.toString());


    }


//    public static boolean function(String[] temp, String flag)
//    {
//        boolean cc = false;
//        int count = 0;
//        for (int i = 0; i < temp.length; i++)
//        {
//            if (flag.equals(temp[i]))
//            {
//                count++;
//                if (count != 1)
//                {
//                    cc = true;
//                }
//            }
//        }
//
//        return cc;
//    }

    public static String sort(String str)
    {
        //利用toCharArray可将字符串转换为char型的数组
        char[] s1 = str.toCharArray();
        for (int i = 0; i < s1.length; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (s1[i] < s1[j])
                {
                    char temp = s1[i];
                    s1[i] = s1[j];
                    s1[j] = temp;
                }
            }
        }
        //再次将字符数组转换为字符串，也可以直接利用String.valueOf(s1)转换
        String st = new String(s1);
        return st;
    }


    public static boolean fun(List<String> list, String temp1)
    {
        boolean q = false;
        int oo = 0;
        for (int j = 0; j < list.size(); j++)
        {

            if (temp1.equals(list.get(j)))
            {
                oo++;
                if (oo >= 1)
                {
                    q = true;
                }
            }
        }
        return q;
    }
}
