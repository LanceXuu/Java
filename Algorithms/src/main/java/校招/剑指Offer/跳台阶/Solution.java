package 校招.剑指Offer.跳台阶;

/**
 * @Author: Lance
 * @Date: 2018/9/3 11:29
 */
public class Solution
{
    public int JumpFloor(int target)
    {
        if (target <= 0)
        {
            return -1;
        }
        if (target == 1)
        {
            return 1;
        } else if (target == 2)
        {
            return 2;
        } else
        {
            return JumpFloor(target - 1) + JumpFloor(target - 2);

        }


    }
}
