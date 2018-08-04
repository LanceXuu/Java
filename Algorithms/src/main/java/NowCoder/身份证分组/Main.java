package NowCoder.身份证分组;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: Lance
 * @Date: 2018/8/3 14:25
 */
public class Main {

    public static void main(String[] args) throws Exception {
        //读取输入
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String line = bufferedReader.readLine();

        if (line.length() < 6) {

            System.out.println(line);

        } else if (line.length() <= 14) {

            System.out.println(line.substring(0, 6) + " " + line.substring(6));

        } else {

            System.out.println(line.substring(0, 6) + " " + line.substring(6, 14) + " " + line.substring(14));
        }
    }

}
