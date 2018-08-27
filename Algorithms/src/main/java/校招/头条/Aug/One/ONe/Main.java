package 校招.头条.Aug.One.ONe;

        import java.util.*;

/**
 * @Author: Lance
 * @Date: 2018/8/25 10:01
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, List<Integer>> map = new HashMap<>();
        int count = 1;
        int laji = 0;

        boolean zero = false;

        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++)
        {
            List<Integer> list = new ArrayList<>();


            while (scanner.hasNext())
            {
                int temp = scanner.nextInt();
                if (temp == 0)
                {
                    break;
                }
                list.add(temp);
            }
            map.put(i, list);


        }

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet())
        {
            int testKey = entry.getKey();
            boolean flag = true;

            List<Integer> tempList = map.get(testKey);

            if (tempList == null)
            {
                zero = true;
                continue;

            }

            for (int i = 0; i < tempList.size(); i++)
            {
                //
                int listNum = tempList.get(i);
                List<Integer> list = map.get(listNum);

                if (list == null)
                {
                    continue;
                }

                if (list.contains(testKey))
                {
                    flag = true;
                }
                else
                {
                    List<Integer> temp2List = map.get(listNum);
                    if (temp2List.contains(testKey))
                    {
                        flag = true;
                    }
                    else
                    {
                        flag = false;
                    }

                }


            }
            if (!flag)
            {
                laji++;
            }


        }
        if (zero || laji > 0)
        {
            count++;
        }
        System.out.println(count);
    }
}
