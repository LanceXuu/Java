package iflytek;

/**
 * @Author: Lance
 * @Date: 2018/7/23 15:20
 */
public class classOne {

    String a;
    String b;

    public classOne(){}

    public classOne(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void function_1() {
        System.out.println(a);
    }

    public void function_2() {
        System.out.println(b);
    }
}
