package 校招.华为笔试题.进制转换;

import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/8/7 19:56
 */
public class Main
{
    public static void main(String[] args) throws Exception
    {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            String six = scanner.next();
            int outoput = Integer.parseInt(six.substring(2), 16);
            System.out.println(outoput);
        }
    }


}
