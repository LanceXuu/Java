package NowCoder;

/**
 * @Author: Lance
 * @Date: 2018/7/23 21:36
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 有一个X*Y的网格，
 * 小团要在此网格上从左上角到右下角，只
 * 能走格点且只能向右或向下走。请设计一个算法，
 * 计算小团有多少种走法。
 * 给定两个正整数int x,int y，请返回小团的走法数目。
 */
public class 网格走数 {

    public static void main(String[] args) throws IOException {

        BufferedReader st = new BufferedReader(new InputStreamReader(System.in));
        String[] str = st.readLine().split(" ");

        int x = Integer.parseInt(str[0]);
        int y = Integer.parseInt(str[1]);
        int[] z = new int[y + 1];

        Arrays.fill(z, 1);

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                z[j] += z[j - 1];
            }
        }
        System.out.println(z[y]);

    }
}
