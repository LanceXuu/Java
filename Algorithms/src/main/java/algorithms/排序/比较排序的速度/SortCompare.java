package algorithms.排序.比较排序的速度;

import algorithms.排序.插入排序.Insertion;
import algorithms.排序.选择排序.Selection;

/**
 * @Author: Lance
 * @Date: 2018/8/10 19:28
 */
public class SortCompare
{


    public static void main(String[] args)
    {
        String alg = args[0];
        String alg1 = args[1];

        int N = Integer.parseInt(args[2]);
        int T = Integer.parseInt(args[3]);

        double t1 = timeRandomInput(alg, N, T);
        double t2 = timeRandomInput(alg1, N, T);

        System.out.println(t1);
        System.out.println(t2);

    }

    public static double time(String alg, Comparable[] a)
    {
//        Stopwatch timer = new Stopwatch();

        long startTime = System.currentTimeMillis();

        if (alg.equals("Insertion"))
        {
            Insertion.sort(a);
        }
        if (alg.equals("Selection"))
        {
            Selection.sort(a);
        }
//        if(alg.equals("Shell")) Shell.sort(a);
//        if(alg.equals("Merge")) Merge.sort(a);
//        if(alg.equals("Quick")) Quick.sort(a);
//        if(alg.equals("Heap")) Heap.sort(a);

//        return timer.elapsed();

        long endTime = System.currentTimeMillis();

        return (endTime - startTime) / 1000;
//        System.out.println("Time: " + (endTime - startTime) / 1000);
    }


    public static double timeRandomInput(String alg, int N, int T)
    {

        double total = 0.0;
        Double[] a = new Double[N];

        for (int i = 0; i < T; i++)
        {
            for (int j = 0; j < N; j++)
            {
                a[j] = Math.random();
                total += time(alg, a);
            }
        }
        return total;

    }


}
