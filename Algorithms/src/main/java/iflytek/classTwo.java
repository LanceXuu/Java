package iflytek;

/**
 * @Author: Lance
 * @Date: 2018/7/23 15:21
 */
public class classTwo {
    public static void main(String[] args) {

        classOne classOneTest = new classOne();

        //调用classOne的set方法即可赋值
        classOneTest.setA("abc");
        classOneTest.setB("cde");
        //输出结果为 abc cde
        classOneTest.function_1();
        classOneTest.function_2();
        //输出结果为null
        new classOne().function_1();

    }
    public void function_1()
    {

        classOne classOneTest = new classOne("abc","cde");
        classOneTest.function_1();
    }
}
