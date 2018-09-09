package 校招.面试宝典.数据结构基础.数据结构技术.两个队列实现栈;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @Author: Lance
 * @Date: 2018/9/4 15:16
 */
public class Main
{

    Queue<Integer> queue1 = new ArrayDeque<Integer>();
    Queue<Integer> queue2 = new ArrayDeque<Integer>();

    public void push(int data)
    {
        queue1.add(data);
    }

    public int pop() throws Exception
    {
        int data = 0;

        if (queue1.isEmpty())
        {
            throw new Exception("队列为空！ ");
        }
        while (!queue1.isEmpty())
        {
            if (queue1.size() == 1)
            {
                data = queue1.poll();
            }

            while (queue2.size() != 0)
            {
                queue1.add(queue2.poll());
                return data;
            }

            queue2.add(queue1.poll());


        }


        return 0;
    }


    public static void main(String[] args) throws Exception
    {

        Main main = new Main();

        main.push(1);
        main.push(2);
        main.push(3);
        main.push(4);
        main.push(5);

        System.out.
                println(main.pop());
        main.pop();


    }


}
