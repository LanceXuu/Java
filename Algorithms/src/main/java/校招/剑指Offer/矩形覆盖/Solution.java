package 校招.剑指Offer.矩形覆盖;


/**
 * @Author: Lance
 * @Date: 2018/9/3 15:48
 */
public class Solution
{
    public int RectCover(int target)
    {
        //奇数\
        if (target < 1)
        {
            return -1;
        } else if (target == 1 || target == 2)
        {
            return target;

        } else
        {
            return RectCover(target - 1) + RectCover(target - 2);
        }


    }
}
