package 校招.平安科技.One;

import javafx.print.Collation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @Author: Lance
 * @Date: 2018/9/16 21:28
 */
public class Main
{
    public static void main(String[] args) throws Exception
    {
        int temp1 = 0;
        int sum = 0;
        int count = 0;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, List<Integer>> map = new HashMap();

        while (bufferedReader.ready())
        {
            String temp = bufferedReader.readLine();
            String[] flag = temp.split(" ");

            int[] falgint = new int[flag.length - 1];
            for (int i = 0; i < falgint.length; i++)
            {
                falgint[i] = Integer.parseInt(flag[i + 1]);
            }

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < falgint.length; i++)
            {
                list.add(falgint[i]);
            }

            map.put(flag[0], list);
        }

        Map<Integer, String> newMap = new HashMap();
        int[] zhi = new int[map.size()];



        for (Map.Entry<String, List<Integer>> entry : map.entrySet())
        {
            String key = entry.getKey();
            List<Integer> list = map.get(key);

//            Collections.sort(nums);

            for (int i = 0; i < list.size(); i++)
            {
                temp1 += list.get(i);

            }

            sum = temp1 / list.size();

            newMap.put(count, key);
            zhi[count] = sum;
            count++;


        }

        for (Map.Entry<Integer, String> entry : newMap.entrySet())
        {
            int key = entry.getKey();
            System.out.print(newMap.get(key) + " ");
            System.out.print(zhi[key]);

        }


    }
}

