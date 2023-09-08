import java.util.*;
class method
{
    int a,b,c;
    method()
    {
    a=10;
    b=5;
    }

    void sum()
    {
        c=a+b;
        System.out.println("Addition is:"+c);
    }
    void sub()
    {
       c=a-b;
       System.out.println("Subration is:"+c);
    }
    void mul()
    {
       c=a*b;
       System.out.println("Multiplication is:"+c);
    }
    void div()
    {
        c=a/b;
        System.out.println("division is:"+c);
    }
}
class main{
    public static void main(String[]args)
    {
        method o=new method();
        o.sum();
        o.sub();
        o.mul();
        o.div();
    }
}