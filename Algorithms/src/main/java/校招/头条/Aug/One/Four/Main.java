package 校招.头条.Aug.One.Four;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/8/25 10:53
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int time = scanner.nextInt();

        List<Integer> list = new LinkedList<>();


        for (int i = 0; i < num; i++)
        {
            int temp = scanner.nextInt();
            list.add(temp);
        }

        for (int i = 0; i < time - 1; i++)
        {
            list.addAll(list);
        }

        for (int i = 0; i < time * num; i++)
        {

        }


    }
}
