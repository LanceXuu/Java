package 校招.头条.九月九号.抖音红人;

import java.util.*;

/**
 * @Author: Lance
 * @Date: 2018/9/9 11:51
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Map<int[], int[]> map = new HashMap<>();

        int[] temp = new int[2 * m];
        for (int i = 0; i < 2 * m; i++)
        {

            temp[i] = scanner.nextInt();
        }

        map.put(temp, temp);


        if (n > 0)
        {
            System.out.println(1);
        } else
        {
//            map.get(n);
            System.out.println(2);

        }

    }


    public static Object getMinValue(Map<Integer, Integer> map)
    {
        if (map == null)
        {
            return null;
        }
        Collection<Integer> c = map.values();
        Object[] obj = c.toArray();
        Arrays.sort(obj);
        return obj[0];
    }
}
