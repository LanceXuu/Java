package ch1.ch1_1;

import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/7/13 15:25
 */
public class Test13 {

    public static void main(String[] args) {

        int M, N;

        System.out.println("please input the matrix:");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            M = scanner.nextInt();
            N = scanner.nextInt();
            break;
        }

        int[][] a = new int[M][N];
        int[][] b = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                java.util.Random random = new java.util.Random();
                a[j][i] = random.nextInt(10);
                b[i][j] = a[j][i];
                System.out.print(a[j][i]);
                System.out.println();
                System.out.print(b[i][j]);
            }
        }
    }
}
