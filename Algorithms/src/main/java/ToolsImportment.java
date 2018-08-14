import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * @Author: Lance
 * @Date: 2018/8/14 17:36
 */
public class ToolsImportment
{

    //取出map中最小的value
    public static Object getMinValue(Map<Integer, Integer> map)
    {
        if (map == null)
        {
            return null;
        }
        Collection<Integer> c = map.values();
        Object[] obj = c.toArray();
        Arrays.sort(obj);
        return obj[0];
    }


    //取出map中最小的key
    public static Object getMinKey(Map<Integer, Integer> map)
    {
        if (map == null)
        {
            return null;
        }
        Set<Integer> set = map.keySet();
        Object[] obj = set.toArray();
        Arrays.sort(obj);
        return obj[0];
    }
}
