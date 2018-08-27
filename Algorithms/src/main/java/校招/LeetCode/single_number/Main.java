package 校招.LeetCode.single_number;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Lance
 * @Date: 2018/8/27 10:12
 */
public class Main
{
    public static void main(String[] args)
    {
        int[] A = {1, 1, 2, 2, 3, 4, 4};
        singleNumber(A);

    }


    public static int singleNumber(int[] A)
    {
        int flag = 0;
        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < A.length; i++)
        {
            int temp = A[i];

            if (!map.containsKey(temp))
            {
                map.put(A[i], 1);
            }
            else
            {
                int temp1 = map.get(A[i]);
                map.put(A[i], temp1++);
            }

        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            int key = entry.getKey();

            if (map.get(key) == 1)
            {
                flag = key;
            }

        }

        System.out.println(flag);
        return flag;
    }
}
