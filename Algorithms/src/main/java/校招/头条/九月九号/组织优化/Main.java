package 校招.头条.九月九号.组织优化;

import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/9/9 11:27
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int[][] temp = new int[num][num];
        for (int i = 0; i < num; i++)
        {
            for (int j = 0; j < num; j++)
            {
                temp[i][j] = scanner.nextInt();
            }
        }

        if (temp[0][0] == 1)
        {
            System.out.println(1);
        }


    }
}
