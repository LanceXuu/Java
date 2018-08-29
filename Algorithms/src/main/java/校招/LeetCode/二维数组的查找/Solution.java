package 校招.LeetCode.二维数组的查找;

/**
 * @Author: Lance
 * @Date: 2018/8/27 15:25
 */
public class Solution
{

    public boolean Find(int target, int[][] array)
    {
        boolean flag = false;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                if (array[i][j] == target)
                {
                    flag = true;
                }
            }
        }


        return flag;
    }
}
