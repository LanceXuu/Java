package 校招.携程.three;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/9/4 20:06
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        Map<Integer, Integer> map = new HashMap<>();

        while (scanner.hasNext())
        {
            String flag = scanner.next();

            if (flag.equals("p"))
            {

                int s1 = scanner.nextInt();
                int s2 = scanner.nextInt();
                if (map.containsKey(s1))
                {
                    map.put(s1, -1);
                    continue;

                }
                map.put(s1, s2);


            } else if (flag.equals("g"))
            {

                int s3 = scanner.nextInt();

                System.out.println(map.get(s3));
            }
        }


    }
}
