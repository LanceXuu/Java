package 校招.阿里巴巴;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/8/12 19:33
 */
public class Main
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int[] flag = new int[count];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < count; i++)
        {
            String temp = scanner.next();
            String[] tenpString = temp.split(",");

            int tempInt;
            int tempInt01;

            tempInt = Integer.parseInt(tenpString[0]);
            tempInt01 = Integer.parseInt(tenpString[1]);


            map.put(tempInt, tempInt01);

        }
    }

    public static void function(int[] flag)
    {

    }
}
