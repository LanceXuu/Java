package ThinkingInJava.第5章.Exercise;

/**
 * @Author: Lance
 * @Date: 2018/8/22 9:58
 */
public class E02_diff
{
    String str1 = "helloStr1";
    String str2;

    E02_diff(String str2)
    {
        this.str2 = str2;
    }

    public static void main(String[] args)
    {
        E02_diff diff = new E02_diff("helloStr2");
        System.out.println(diff.str1);
        System.out.println(diff.str2);
    }

}

class Test
{

}
