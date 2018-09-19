package 校招.滴滴.ONe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lance
 * @Date: 2018/9/18 20:04
 */
public class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String str = bufferedReader.readLine();
        String[] flag = str.split(" ");


        List<char[]> list = new ArrayList<>();
        for (int i = 0; i < flag.length; i++)
        {
            char[] temp = flag[i].toCharArray();
            list.add(temp);
        }

        System.out.println(flag[0] + flag[1] + flag[2]);


    }
}
