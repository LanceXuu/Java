// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// CLASS BEGINS, THIS CLASS IS REQUIRED
class Solution
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    List<String> findAllMsg(String message)
    {
        // WRITE YOUR CODE HERE
        String[] temp = message.split("");
        List<String> listA = new ArrayList<>();
        StringBuffer sb = new StringBuffer();

        Map<Integer, List> map = new HashMap<>();
        int[] a = {0, 1};

        for (int i = 0; i < temp.length; i++)
        {
            List<String> list = new ArrayList<>();
            if (temp[i].equals("?"))
            {

                list.add("0");
                list.add("1");

                map.put(i, list);
            } else
            {
                list.add(temp[i]);
                map.put(i, list);
            }
        }



        for (Map.Entry<Integer, List> entry : map.entrySet())
        {
            int testKey = entry.getKey();
            List<String> list = map.get(testKey);

            if (list.size() != 2)
            {
                sb.append(list.get(0));
            } else
            {
                sb.append("0");
            }
        }
        listA.add(new String(sb));


        return listA;
    }
    // METHOD SIGNATURE ENDS
}