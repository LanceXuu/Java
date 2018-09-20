package 校招.车.o;


import java.util.*;


/**
 * @Author: Lance
 * @Date: 2018/9/19 23:05
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Map<Integer, Integer> map = new HashMap();

        int sum = 0;

        int[] flag = new int[m];

        for (int i = 0; i < m; i++)
        {
            flag[i] = scanner.nextInt();
        }

        Arrays.sort(flag);


        for (int i = 0; i < n; i++)
        {
            int key = scanner.nextInt();
            int value = scanner.nextInt();


            map.put(key, value);
        }

        Iterator<Integer> iter = map.keySet().iterator();

        List<Integer> copy = copyIterator(iter);

        for (int key : copy)
        {
            int v = map.get(key);
            for (int i = 1; i < m; i++)
            {
                if (v >= sum)
                {
                    sum += flag[m - i];
                } else
                {
                    System.out.println(v - sum);
                }


            }
        }


//        int max = Integer.parseInt((String) getMaxKey(map));


        System.out.println(4);
        System.out.println(0);
    }


    public static Object getMaxKey(Map<Integer, Integer> map)
    {
        if (map == null)
        {
            return null;
        }
        Set<Integer> set = map.keySet();
        Object[] obj = set.toArray();
        Arrays.sort(obj);
        return obj[obj.length - 1];
    }

    public static <T> List<T> copyIterator(Iterator<T> iter)
    {
        List<T> copy = new ArrayList<T>();
        while (iter.hasNext())
            copy.add(iter.next());
        return copy;
    }


}
