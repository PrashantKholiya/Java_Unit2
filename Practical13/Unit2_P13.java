package Practical13;

public class Unit2_P13
{
    public static void main()
    {
        Assignment_Question_Unit2 obj=new Assignment_Question_Unit2();
        obj.abstractClassCall();
        obj.OlAndOr();
        obj.accessPro();
        obj.interfaceImp();
    }
}

class Assignment_Question_Unit2
{
    void abstractClassCall()
    {
        Sample3 obj=new Sample3();
        obj.run();
    }
    void OlAndOr()
    {
        Sample3 obj=new Sample3();
        obj.run();
        obj.run(1);
        obj.run(1,2);
        obj.display();
    }
    void accessPro()
    {
        Sample3 obj=new Sample3();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        obj.show();
        obj.display();
    }
    void interfaceImp()
    {
        Sample3 obj=new Sample3();
        obj.display1();
        obj.display2();
    }
}
abstract class Sample2
{
    int a=10;
    public int b=20;
    protected int c=30;
    private int d=40;
    void show()
    {
        System.out.println("inside SAmple2");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
    }
    public void display()
    {
        System.out.println("Display method of abstract class");
    }
    abstract public void run();
}

class Sample3 extends Sample2 implements A3,B3
{
    public void display()
    {
        System.out.println("Inside child class");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }
    public void display1()
    {
        System.out.println("display 1 of child class");
    }
    public void display2()
    {
        System.out.println("display 2 of child class");
    }
    public void run()
    {
        System.out.println("run method of abstract class");
    }
    public void run(int a)
    {
        System.out.println("run method overloaded in Sample3");
    }
    public void run(int a,int b)
    {
        System.out.println("run method overloaded in Sample3");
    }
}
interface A3
{
    public void display1();
}

interface B3
{
    public void display2();
}