package 校招.网易笔试题;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/8/14
 */
public class Main
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext())
        {

            int lineNumber = scanner.nextInt();
            int count = scanner.nextInt();

            int[] game = new int[lineNumber];

            while (count > 0)
            {
                int test = scanner.nextInt();
                game[test - 1]++;
                count--;
            }

            Arrays.sort(game);
            System.out.println(game[0]);


        }
    }
}


//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.*;
//
///**
// * @Author: Lance
// * @Date: 2018/8/14 16:47
// */
//public class Main
//{
//    public static void main(String[] args) throws Exception
//    {
////        Scanner scanner = new Scanner(System.in);
////
////        int listNum = scanner.nextInt();
////        int count = scanner.nextInt();
//
//
//
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        while(true
//        ){
//        String flag = bufferedReader.readLine();
//        String [] flagString = flag.split(" ");
//
//        int listNum = Integer.parseInt(flagString[0]);
//        int count = Integer.parseInt(flagString[1]);
//
//        String temp = bufferedReader.readLine();
//        String[] tempString = temp.split(" ");
//
//        Map<Integer, Integer> map = new HashMap<>();
//
//        int[] arr = new int[tempString.length];
//
//        for (int i = 0; i < tempString.length; i++)
//        {
//            arr[i] = Integer.parseInt(tempString[i]);
//        }
//
//        map = function(arr);
//        function_2(map, listNum);
//
//
//    }
//    }
//
//    /**
//     * 把所有数据存到map里面去
//     *
//     * @param arr
//     * @return
//     */
//    public static Map function(int[] arr)
//    {
//
//        Map<Integer, Integer> map = new HashMap();
//
//        //把出现的所有数据以kv的形式存在map里面，k为第几列，v为这一列出现了多少次
//        for (int i : arr)
//        {
//            if (!map.containsKey(i))
//            {
//                map.put(i, 0);
//            }
//
//            if (map.containsKey(i))
//            {
//                map.put(i, map.get(i) + 1);
//            }
//
//        }
//        return map;
//
//
//    }
//
//
//    /**
//     * 统计得到了多少分
//     * 方法逻辑：map的k必须为指定的列数，否则返回为o
//     * map的k锁指定的最小v为最终得分
//     */
//    public static void function_2(Map map, int lineNum)
//    {
//        if (map.size() != lineNum)
//        {
//            return;
//        }
//
//        getMinValue(map);
//
//
//    }
//
//
//    public static void getMinValue(Map map)
//    {
//        if (map == null)
//        {
//            return;
//        }
//        Collection<Integer> collection = map.values();
//
//        Object[] obj = collection.toArray();
//
//        Arrays.sort(obj);
//        System.out.println(obj[0]);
//    }
//
//}
