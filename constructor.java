import java.util.*;
class cons
{
    int a,b,c;
    cons()
    {
       a=10;
       b=5;
    }
    cons(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    cons(cons copy)
    {
        a=copy.a;
        b=copy.b;
    }
    void add()
    {
        int c=a+b;
        System.out.println("the value of c is:"+c);
    }
}
class m
{
    public static void main(String[]args)
    {
        cons o=new cons();
        o.add();
        cons o1=new cons(10,30);
        o1.add();
        cons o2=new cons(o1);
        o2.add();
    }
}