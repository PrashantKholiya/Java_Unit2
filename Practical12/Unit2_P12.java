package Practical12;

interface Animal
{
    public void sound();
    public void run();
}

interface Human
{
    public void sound1();
    public void run1();
}

public class Unit2_P12 implements Animal
{
    public static void main(String[] args)
    {
        C1 obj=new C1();
        obj.fA();
        obj.fB();
    }

    public void sound() {

    }
    public void run() {

    }
}

class Species implements Animal,Human
{
    public void sound()
    {
        System.out.println("inside sound of animal");
    }
    public void run()
    {
        System.out.println("inside run of animal");
    }
    public void sound1()
    {
        System.out.println("inside sound of human");
    }
    public void run1()
    {
        System.out.println("inside run of human");
    }
}

interface A1
{
    void fA();
}
interface B1
{
    void fB();
}

class C1 implements B1
{
    public void fA()
    {
        System.out.println("inside A1");
    }
    public void fB()
    {
        System.out.println("inside B1");
    }
}