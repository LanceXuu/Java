package 校招.LeetCode.single_number;

/**
 * @Author: Lance
 * @Date: 2018/8/27 10:12
 */
public class Main
{



    public int singleNumber(int[] A)
    {

        int result = A[0];
        for (int i = 1; i < A.length; i++)
        {
            result = result ^ A[i];
        }
        return result;
    }
}