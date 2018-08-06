package NowCoder.网络走格数法;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: Lance
 * @Date: 2018/8/6 9:15
 */
public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String temp = bufferedReader.readLine();

        String[] redex = temp.split(" ");

        //把String 类型强转为 int
        int x = Integer.parseInt(redex[0]);
        int y = Integer.parseInt(redex[1]);

        int dp[][] = new int[11][11];
        dp[0][0] = 0;

        for (int i = 0; i <= x; i++) {
            dp[i][0] = 1;
        }

        for (int i = 0; i <= y; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {

                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];

            }
        }
        System.out.println(dp[x][y]);


    }

}
