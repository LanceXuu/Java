package 校招.平安科技.two;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/9/16 22:00
 */
public class Main
{
    public static void main(String[] args) throws Exception
    {
//        Scanner scanner = new Scanner(System.in);
        BufferedReader tt = new BufferedReader(new InputStreamReader(System.in));
        String string = tt.readLine();

        char[] strings = string.toCharArray();
        int i = 0;
        int j = strings.length - 1;
        while (i <= j)
        {
            char temp = strings[i];
            strings[i] = strings[j];
            strings[j] = temp;
            i++;
            j--;
        }

        String s = new String(strings);
        String ss = toUpperCaseFirstOne(s);
        System.out.println(ss);

    }

    public static String toUpperCaseFirstOne(String s)
    {
        if(Character.isUpperCase(s.charAt(0)))
            return s;
        else
            return (new StringBuilder()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
    }
}
