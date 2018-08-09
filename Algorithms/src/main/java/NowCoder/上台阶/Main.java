package NowCoder.上台阶;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: Lance
 * @Date: 2018/8/6 15:47
 */
public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String temp = bufferedReader.readLine();

        int m = Integer.parseInt(temp);
        System.out.println(new Main().Up(m));
    }

    public int Up(int m) {
        long dp[] = new long[101];

        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;

        for (int i = 4; i <= m; i++) {

            int mod = 1000000007;
            dp[i] = (dp[i - 1]  +  dp[i - 2] )% mod;


        }
        return (int)dp[m] ;
    }


}
