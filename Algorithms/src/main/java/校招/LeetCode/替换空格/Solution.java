package 校招.LeetCode.替换空格;

/**
 * @Author: Lance
 * @Date: 2018/8/27 15:35
 */
public class Solution
{
    public String replaceSpace(StringBuffer str)
    {
        String flag;
        String temp = str.toString();

        flag = temp.replace(" ", "%20");
        return flag;
    }
}
