//package NowCoder;
//
///**
// * @Author: Lance
// * @Date: 2018/7/25 20:36
// */
//
//import java.io.*;
//import java.util.Scanner;
//
///**
// * 小明同学学习了不同的进制之后，
// * 拿起了一些数字做起了游戏。
// * 小明同学知道，在日常生活中我们最常用的是十进制数，而在计算机中，二进制数也很常用。
// * 现在对于一个数字x，小明同学定义出了两个函数f(x)和g(x)。
// * f(x)表示把x这个数用十进制写出后各个数位上的数字之和。
// * 如f(123)=1+2+3=6。 g(x)表示把x这个数用二进制写出后各个数位上的数字之和。
// * 如123的二进制表示为1111011，那么，g(123)=1+1+1+1+0+1+1=6。
// * 小明同学发现对于一些正整数x满足f(x)=g(x)，他把这种数称为幸运数，现在他想知道，大于0且小于等于n的幸运数有多少个？
// */
//public class JD_luncklyNumber {
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
//        String[] canshu = Integer.parseInt(buff.readLine().split(" "));
//
//
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        new JD_luncklyNumber().f(x);
//
////        System.out.println("个位 " + (n % 10));
////        System.out.println("十位 " + (n % 100) / 10);
////        System.out.println("百位 " + (n % 1000) / 100);
////        System.out.println("千位 " + (n / 1000));
//
//
//    }
//
//    public int f(int x) {
//
//        int total = 0;
//        int cout = 0;
//
//        while (total > 0) {
//
//            total = total / 10;
//            cout++;
//
//        }
//
//        String[] number = new String[cout];
//
//        for (int i = 0; i < cout; i++) {
//
//            int a = 0;
//            a += x % 10;
//            x = x / 10;
//            System.out.println(a);
//        }
//        return 1;
//
//
//    }
//}
