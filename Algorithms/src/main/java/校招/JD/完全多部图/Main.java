package 校招.JD.完全多部图;

import java.util.*;

/**
 * @Author: Lance
 * @Date: 2018/9/9 20:38
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < M; i++)
        {
            List list = new ArrayList();
            list.add(scanner.nextInt());
            list.add(scanner.nextInt());

            map.put(i + 1, list);
        }

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet())
        {
            int key = entry.getKey();


            List<Integer> list = map.get(key);

            if (list.get(0)!=){

            System.out.println("Yes");
        }

    }
}
