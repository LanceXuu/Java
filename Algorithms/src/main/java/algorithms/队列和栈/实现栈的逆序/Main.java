package algorithms.队列和栈.实现栈的逆序;

import java.util.Stack;

/**
 * @Author: Lance
 * @Date: 2018/9/4 9:39
 */
public class Main
{
    public static void main(String[] args)
    {

    }

    public int get(Stack<Integer> stack)
    {
        int result = stack.pop();
        if (stack.empty())
        {
            return result;
        } else
        {
            int last = get(stack);
            stack.push(last);
            return last;
        }


    }

    public void reverse(Stack<Integer> stack)
    {
        int result = stack.pop();
        if (stack.empty())
        {
            return;
        } else
        {
            int i = get(stack);
            reverse(stack);
            stack.push(i);
        }
    }
}
