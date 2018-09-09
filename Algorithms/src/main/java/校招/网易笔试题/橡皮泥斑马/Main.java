package 校招.网易笔试题.橡皮泥斑马;

import java.util.*;

/**
 * @Author: Lance
 * @Date: 2018/9/8 15:43
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Map<Integer, List<Integer>> map = new HashMap();
        int[] count = new int[m + 1];


        for (int i = 0; i < n; i++)
        {
            int key = scanner.nextInt();
            if (!map.containsKey(key))
            {
                count[key] = 1;
                int temp = scanner.nextInt();
                List<Integer> list = new ArrayList<>();

                list.add(temp);

                map.put(key, list);
            } else
            {

                int temp = scanner.nextInt();
                List<Integer> list = map.get(key);

                list.add(temp);
                map.put(key, list);

                count[key]++;


            }
        }

        int max = getMaxValue(count);

        if (max == 1)
        {
            System.out.println(0);

        } else if (count[max] == count[1])
        {
            Object list = getMinValue(map);


            int temp = Integer.parseInt(String.valueOf(list));


            System.out.println(temp);
        } else
        {
            List<Integer> list = map.get(max);
            int sum = 0;
            for (int i = 0; i < list.size(); i++)
            {
                sum += list.get(i);
            }
            System.out.println(sum);
        }


    }


    public static int getMaxValue(int[] count)
    {
        int max = count[1];

        for (int i = 1; i < count.length; i++)
        {
            if (max < count[i])
            {
                max = count[i];
            }

        }
        return max;

    }


    public static Object getMinValue(Map<Integer, List<Integer>> map)
    {
        if (map == null)
        {
            return null;
        }
        Collection<List<Integer>> c = map.values();
        Object[] obj = c.toArray();
        Arrays.sort(obj);
        return obj[0];
    }
}
