package 校招.头条.九月九号.one;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/9/9 10:01
 */
public class Main
{
    public static void main(String[] args) throws Exception
    {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
//        String temp = bufferedReader.readLine();

        String temp = scanner.next();

        String[] flag = temp.split("");

        List<Integer> list = new ArrayList();


        int count = 1;
        String target = flag[0];
        for (int i = 0; i < flag.length; i++)
        {

            if (!target.equals(flag[i]))
            {
                count++;
                target = flag[i];
                list.add(count);

            } else
            {
                list.add(count);
                count = 1;
                target = flag[i];
                continue;
            }


        }

        int flag111 = function(list);
        System.out.println(flag111);

    }


    public static int function(List<Integer> list)
    {
        int target = list.get(0);

        for (int i = 0; i < list.size(); i++)
        {
            if (target < list.get(i))
            {
                target = list.get(i);
            }
        }

        return target;
    }
}
