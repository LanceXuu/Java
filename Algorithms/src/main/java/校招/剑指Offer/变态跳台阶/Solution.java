package 校招.剑指Offer.变态跳台阶;

/**
 * @Author: Lance
 * @Date: 2018/9/3 15:22
 */
public class Solution
{
    public int JumpFloorII(int target)
    {
        int flag = 0;

        if (target <= 0)
        {
            return -1;
        } else if (target == 1)
        {
            return 1;
        } else if (target == 2)
        {
            return 2;
        } else
        {
            return 2 * JumpFloorII(target - 1);
        }
    }
}
