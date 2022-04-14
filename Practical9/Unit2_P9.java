package Practical9;

abstract class Bike
{
    int a;
    Bike()
    {
        System.out.println("Inside Bike Constructor:"+a+"\n");
    }
    abstract void run();
    void display()
    {
        System.out.println("display method");
    }
}

class Honda extends Bike
{

    void run() {

    }
}

public class Unit2_P9
{
    public static void main(String[] args)
    {
        Bike obj=new Honda();
        obj.display();
    }
}

final class Super
{
    public int data=30;
    void display()
    {
        System.out.println(data);
    }
}

//public class Sub extends Super
//{
//    void display2()
//    {
//        display();
//    }
//}