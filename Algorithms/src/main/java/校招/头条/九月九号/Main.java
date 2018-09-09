package 校招.头条.九月九号;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int num=findLongestSubstringLength(s);
        System.out.println(num);

    }
    private static int findLongestSubstringLength(String string)
    {
        if (string == null || string.equals("")) return 0;
        int maxLength = 0;
        int curLength = 0;
        int[] temp = new int[26];
        for (int i = 0; i < temp.length; i++)
        {
            temp[i] = -1; //初始化为-1，负数表示没出现过
        }
        for (int i = 0; i < string.length(); i++)
        {
            int curChar = string.charAt(i) - 'a';
            int prePosition = temp[curChar];
            int distance = i - prePosition;
            if (prePosition < 0 || distance > curLength)
            {
                curLength++;
            } else
            {
                //更新最长非重复子字符串的长度
                if (curLength > maxLength)
                {
                    maxLength = curLength;
                }
                curLength = distance;
            }
            temp[curChar] = i; //更新字符出现的位置
        }
        if (curLength > maxLength)
        {
            maxLength = curLength;
        }
        return maxLength;
    }
}

