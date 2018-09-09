package 校招.面试宝典.数据结构基础.数据结构技术.两个栈实现一个队列;

import java.util.Stack;

/**
 * @Author: Lance
 * @Date: 2018/9/4 15:04
 */
public class Main
{

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();


    public static void main(String[] args) throws Exception
    {
        Main main = new Main();
        main.push(1);
        main.push(2);
        main.push(3);
        main.push(4);
        main.push(5);


        System.out.println(main.pop());

    }

    public void push(int value)
    {
        stack1.push(value);
    }

    public int pop() throws Exception
    {
        if (stack2.empty())
        {
            while (!stack1.empty())
            {
                stack2.push(stack1.pop());
            }

            if (stack2.empty())
            {
                throw new Exception("队列为空");
            }

        }
        return stack2.pop();
    }
}
