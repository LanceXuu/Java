package 校招.迅雷.One;

import io.swagger.models.auth.In;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/9/13 19:27
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String A = scanner.next();
        String B = scanner.next();

//        char[] charsA = A.toCharArray();
//        char[] charsB = A.toCharArray();

        String[] charsA = A.split("");
        String[] charsB = B.split("");


        Map<String, String> map = new HashMap();

        for (int i = 0; i < charsA.length; i++)
        {
            map.put(charsA[i], charsB[i]);
        }

//        int countA = fun(charsA);
//        int countB = fun(charsB);

        if (A.equals(B))
        {
            for (Map.Entry<String, String> entry : map.entrySet())
            {

            }

            System.out.println(0);
        } else
        {
            int count = 0;

            for (Map.Entry<String, String> entry : map.entrySet())
            {
                String temp = entry.getKey();
                if (temp.equals(map.get(temp)))
                {
                    continue;
                } else
                {
                    count++;
                }
            }
            if (count == 2)
            {

                System.out.println(1);
            } else
            {
                System.out.println(0);

            }
        }

    }

//    public static int fun(char[] chars)
//    {
//
//        int ooo;
//        int count = 0;
//        for (int i = 0; i < chars.length; i++)
//        {
//            if (i != chars.length - 1)
//            {
//                ooo = chars[i];
//                count += ooo;
//            }
//        }
//
//        return count;
//    }

}
