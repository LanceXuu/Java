package 校招.携程.two;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @Author: Lance
 * @Date: 2018/9/4 19:41
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int flag = scanner.nextInt();

        Map<Integer, List<Integer>> map = new HashMap<>();
        List sortList = new ArrayList();


        for (int i = 0; i < num; i++)
        {
            int ii = 2;
            List<Integer> list = new ArrayList<>();

            int key = scanner.nextInt();

            while (ii > 0)
            {
                int temp = scanner.nextInt();
                list.add(temp);
                ii--;
            }

            map.put(key, list);
        }


        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet())
        {
            int testKey = entry.getKey();

            List<Integer> testList = map.get(testKey);

            if (flag >= testList.get(0) && flag <= testList.get(1))
            {
                sortList.add(testKey);
            }


        }
        if (sortList.size()==0)
        {
        System.out.println("null");
        }


        Collections.sort(sortList);

        for (int i = 0; i < sortList.size(); i++)
        {
            System.out.println(sortList.get(i));
        }


    }


}
