package 华为笔试题.大小写切换;

import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/8/8 19:01
 */
public class Main
{

    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNext())
        {

            String temp = scanner.next();

            change(temp);
        }

    }

    public static void change(String str)
    {


        char[] chars = str.toCharArray();
        for (int i = 0, length = chars.length; i < length; i++)
        {
            char c = chars[i];
            if (Character.isUpperCase(c))
            {
                chars[i] = Character.toLowerCase(c);
                continue;
            }
            chars[i] = Character.toUpperCase(c);
        }
        String str1 = new String(chars);
        System.out.println(str1);
    }

}
