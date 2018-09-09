package 校招.科大讯飞;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/9/7 16:50
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        //输入几组
        for (int i = 0; i < num; i++)
        {
            int n = scanner.nextInt();
            int score = scanner.nextInt();

            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++)
            {
                list.add(scanner.nextInt());

            }

            int aver = 0;

            for (int j = 0; j < list.size(); j++)
            {
                int temp = list.get(j);
                aver += temp;

                int flag = aver / n;
                if (flag < score)
                {

                }

            }

        }

    }


}
