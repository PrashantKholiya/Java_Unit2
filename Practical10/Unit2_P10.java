package Practical10;

public class Unit2_P10
{
    public static  void main(String[] args)
    {
        OlAndOr obj=new OlAndOr();
        System.out.println("add() with 2 parameters");
        System.out.println(obj.add(4,6));
        System.out.println("add() with 3 parameters");
        System.out.println(obj.add(4,6,10));
        InheritFirst obj2=new InheritFirst();
        System.out.println(obj2.add(5,3));
    }
}

class OlAndOr
{
    int add(int a,int b)
    {
        System.out.println("inside OlAndOr");
        return a+b;
    }
    int add(int a,int b,int c)
    {
        System.out.println("inside OlAndOr");
        return a+b+c;
    }
}

class InheritFirst extends OlAndOr
{
    int add(int a,int b)
    {
        System.out.println("inside InheritFirst");
        return a+b;
    }
    int add(int a,int b,int c)
    {
        System.out.println("InheritFirst");
        return a+b+c;
    }
}