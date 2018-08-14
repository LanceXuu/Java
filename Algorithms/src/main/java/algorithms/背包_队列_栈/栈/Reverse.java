package algorithms.背包_队列_栈.栈;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Stack;

/**
 * @Author: Lance
 * @Date: 2018/8/14 16:18
 */
public class Reverse
{
    public static void main(String[] args)
    {
        Stack<Integer> stack;
        stack = new Stack<Integer>();

        while (!StdIn.isEmpty())
        {
            stack.push(StdIn.readInt());

        }

        for (int i : stack)
        {
            StdOut.println(i);
        }


    }


}