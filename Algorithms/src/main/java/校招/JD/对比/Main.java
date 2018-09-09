package 校招.JD.对比;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/9/9 20:12
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int count = 0;

        List<shop> list = new ArrayList();
        for (int i = 0; i < num; i++)
        {
            shop temp = new shop();
            temp.setA(scanner.nextInt());
            temp.setB(scanner.nextInt());
            temp.setC(scanner.nextInt());

            list.add(temp);

        }


        for (int i = 0; i < list.size(); i++)
        {
            int a = list.get(i).a;
            int b = list.get(i).b;
            int c = list.get(i).c;
            for (int j = 0; j < list.size(); j++)
            {
                int tempA = list.get(j).a;
                int tempB = list.get(j).b;
                int tempC = list.get(j).c;

                if (a >= tempA)
                {
                    continue;
                } else
                {
                    if (b >= tempB)
                    {
                        continue;
                    } else
                    {
                        if (c >= tempC)
                        {
                            continue;
                        } else
                        {
                            count++;
                            break;
                        }
                    }
                }
            }

        }

        System.out.println(count);

    }


    static class shop
    {
        private int a;
        private int b;

        public int getA()
        {
            return a;
        }

        public void setA(int a)
        {
            this.a = a;
        }

        public int getB()
        {
            return b;
        }

        public void setB(int b)
        {
            this.b = b;
        }

        public int getC()
        {
            return c;
        }

        public void setC(int c)
        {
            this.c = c;
        }

        private int c;
    }
}
