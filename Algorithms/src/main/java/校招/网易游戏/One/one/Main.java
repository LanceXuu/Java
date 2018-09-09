package 校招.网易游戏.One.one;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/9/8 19:01
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<String[]> list = new ArrayList<>();

        for (int i = 0; i < N; i++)
        {
            String[] flag = new String[3];

            flag[0] = scanner.next();
            flag[1] = scanner.next();
            flag[2] = scanner.next();

            list.add(flag);
        }

        int num = scanner.nextInt();

        for (int i = 0; i < num; i++)
        {
            int chaxuncishu = scanner.nextInt();
            if (chaxuncishu == 1)
            {

                String[] flag = new String[2];
                flag[0] = scanner.next();
                flag[1] = scanner.next();


                String target = flag[1];
                function(list, target);
            } else if (chaxuncishu == 2)
            {
                String[] flag = new String[2];
                flag[0] = scanner.next();
                flag[1] = scanner.next();

                String target = flag[1];
                function(list, target);

                String[] flag1 = new String[2];
                flag1[0] = scanner.next();
                flag1[1] = scanner.next();

                int id = Integer.parseInt(flag1[1]);
                function1(list, id);

            } else if (chaxuncishu == 3)
            { //1
                String[] flag = new String[2];
                flag[0] = scanner.next();
                flag[1] = scanner.next();

                String target = flag[1];
                function(list, target);

                //2
                String[] flag1 = new String[2];
                flag1[0] = scanner.next();
                flag1[1] = scanner.next();

                int id = Integer.parseInt(flag1[1]);
                function1(list, id);

                //3
                String[] flag2 = new String[2];
                flag2[0] = scanner.next();
                flag2[1] = scanner.next();

                int num2 = Integer.parseInt(flag2[1]);
                function2(list, id, num2);

            } else
            {
                //1
                String[] flag = new String[2];
                flag[0] = scanner.next();
                flag[1] = scanner.next();

                String target = flag[1];
                function(list, target);

                //2
                String[] flag1 = new String[2];
                flag1[0] = scanner.next();
                flag1[1] = scanner.next();

                int id = Integer.parseInt(flag1[1]);
                function1(list, id);

                //3
                String[] flag2 = new String[2];
                flag2[0] = scanner.next();
                flag2[1] = scanner.next();

                int num2 = Integer.parseInt(flag2[1]);
                function2(list, id, num2);

                //4
                String[] flag3 = new String[2];
                flag3[0] = scanner.next();
                flag3[1] = scanner.next();

                int num3 = Integer.parseInt(flag3[1]);
                function3(list, id, num3);
            }

        }


    }


    public static void function(List<String[]> list, String target)
    {
        int count = 0;
        for (int j = 0; j < list.size(); j++)
        {
            String[] temp1 = list.get(j);
            String flag1 = temp1[2];

            if (flag1.indexOf(target) != -1)
            {
                System.out.println(temp1[2]);
                count++;

                break;
            }
        }

        if (count == 0)
        {
            System.out.println("ERROR");
        }
    }


    public static void function1(List<String[]> list, int id)
    {
        for (int i = 0; i < list.size(); i++)
        {
            String[] temp1 = list.get(i);
            String flag1 = temp1[1];

            String shuchu = temp1[2];


            int flag = Integer.parseInt(flag1);

            if (id == flag)
            {
                System.out.println(shuchu);
                break;
            }

        }

    }

    public static void function2(List<String[]> list, int id, int num)
    {
        for (int i = 0; i < list.size(); i++)
        {
            String[] temp1 = list.get(i);
            String flag1 = temp1[1];

            String shuchu = temp1[2];
            int flag = Integer.parseInt(flag1);

            if (id == flag)
            {
                System.out.println(shuchu);
                if (num > i + 1)
                {
                    for (int j = 0; j < i; j++)
                    {
                        System.out.println(list.get(j)[2]);

                    }


                } else
                {
                    for (int j = i - num; j < num; j++)
                    {
                        int i1 = 1;
                        System.out.println(list.get(j)[2]);
                        i1++;
                        if (i1 == num)
                        {
                            break;
                        }
                    }
                }
            }
        }
    }


    public static void function3(List<String[]> list, int id, int num)
    {
        for (int i = 0; i < list.size(); i++)
        {
            String[] temp1 = list.get(i);
            String flag1 = temp1[1];

            String shuchu = temp1[2];
            int flag = Integer.parseInt(flag1);

            if (id == flag)
            {
                System.out.println(shuchu);
                if (num > list.size() - i)
                {
                    for (int j = i; j <= list.size() - 1; j++)
                    {
                        System.out.println(list.get(j)[2]);

                    }


                } else
                {
                    for (int j = i; j < num; j++)
                    {
                        int i1 = 1;
                        System.out.println(list.get(j)[2]);
                        i1++;
                        if (i1 == num)
                        {
                            break;
                        }
                    }
                }
            }
        }
    }


}
