package 校招.面试宝典.数据结构基础.数据结构技术;

import java.util.Stack;

/**
 * @Author: Lance
 * @Date: 2018/9/4 11:03
 */
public class Stacks
{
    static String[] mothons = {"1月", "2yue", "3yue", "4yue", "5yue", "6yue", "7yue", "8yue"};

    public static void main(String[] args)
    {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < mothons.length; i++)
        {
            stack.push(mothons[i] + " ");
        }
        stack.addElement("The last line");
        System.out.println("element  5 = " + stack.elements());


    }
}
