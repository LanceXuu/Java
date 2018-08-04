package NowCoder;

import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/7/25 21:26
 */
public class printNumber {
        public static void main(String[] args)
        {
            //最多输入十亿位
            //创建一个数组，遍历输出相应的位数
            String[] str = new String[]{"十位","百位","千位","万位","十万位","百万位","千万位","亿位","十亿位","百亿位","千亿位"};

            System.out.println("请输入一个数字：");
            Scanner sca = new Scanner(System.in);

            //接受用户输入的数
            long sum = sca.nextInt(); //声明一个长整型变量
            long sum2 = sum; //分开判断正 负数
            int a = 0;

            for (int i = 0 ; i<32 ;i++ )
            {
                //判断用户输入的数是几位数
                if(sum/10 > 0){ //个位数大于0，为正数
                    sum = sum/10;
                    a++;
                }else{
                    break;
                }
            }

            if (sum2 < 10) //如果是负数
            {
                long k = sum;
                System.out.println("这个数只有个位是"+k);//

            }else{
                //把用户输入的数是分解出来
                for (int i = 0 ;i <= a ;i++ )
                {
                    if (i==0)
                    {
                        long c = sum2 % 10; //个位数
                        System.out.println("这个数的个位是："+c);

                    }else if(i < a){
                        //这里要强转一下 这个函数出来的double;
                        long new1 = (long)Math.pow(10,i);

                        //参数说明：m为要求方的数，n为次方数
                        long b = sum2 / new1 % 10;
                        System.out.println("这个数的"+str[i-1]+"是："+b);

                    }else{
                        long new2= (long)Math.pow(10,i);
                        long h = sum2 / new2 % 10;
                        System.out.println("这个数的"+str[i-1]+"是："+h);
                    }
                }

            }

        }

}
