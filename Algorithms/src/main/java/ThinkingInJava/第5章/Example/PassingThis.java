package ThinkingInJava.第5章.Example;

/**
 * @Author: Lance
 * @Date: 2018/8/22 11:14
 */
class Person
{
    public void eat(Apple apple)
    {
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
    }
}

class Peeler
{
    static Apple peel(Apple apple)
    {
        //...remove peel
        return apple;//Peeled
    }
}

class Apple
{
    Apple getPeeled()
    {
        return Peeler.peel(this);
    }
}


public class PassingThis
{
    public static void main(String[] args)
    {
        new Person().eat(new Apple());
    }
}
