package Practical11;

public class Unit2_P11_Task1
{
    public int a=10;
    public static void main(String[] args)
    {
        ChildClass obj=new ChildClass();
        obj.show();
        obj.access();
    }
}

class ParentClass
{
    int a=10;
    public int b=20;
    protected int c=30;
    private int d=40;
    void show()
    {
        System.out.println("Inside Parent Class");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
    }
}

class ChildClass extends ParentClass
{
    void access()
    {
        System.out.println("Inside Child Class");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }
}