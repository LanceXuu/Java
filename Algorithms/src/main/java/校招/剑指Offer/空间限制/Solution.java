package 校招.剑指Offer.空间限制;

/**
 * @Author: Lance
 * @Date: 2018/9/3 10:39
 */
public class Solution
{
    public int minNumberInRotateArray(int[] array)
    {

        if (array == null)
        {
            return 0;
        } else
        {
            //
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (min > array[i])
            {
                min = array[i];
            }
        }




        return min;
    }
}
