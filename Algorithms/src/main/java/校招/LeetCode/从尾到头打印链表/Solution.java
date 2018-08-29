package 校招.LeetCode.从尾到头打印链表;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Author: Lance
 * @Date: 2018/8/27 16:26
 */
public class Solution
{
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode)
    {
        Stack<Integer> stack = new Stack<Integer>();
        while (listNode != null)
        {
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        while (!stack.isEmpty())
        {
            list.add(stack.pop());
        }
        return list;
    }
}


