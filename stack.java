import java.util.*;
class stack
{
    int top=-1;
    int num;
    int a[]=new int[5];
    Scanner d=new Scanner(System.in);
    void push()
    {
        if(top==4)
        {
            System.out.println("THE STACK IS OVERFLOW:");
        }
        else
        {
        System.out.println("ENTER THE NUMBER TO BE PUSHED:");
        num=d.nextInt();
        top++;
        a[top]=num;
        }
    }
    void pop()
    {
        if(top==-1)
        System.out.println("STACK IS EMPTY:");
        else
        {
            System.out.println("THE DELETION OF THE ELEMENT FROM THE STACK IS:"+a[top]);
            top--;
        }
    }
    void display()
    {
         if(top==-1)
        System.out.println("STACK IS EMPTY:");
        else
        System.out.println("THE TOP OF THE STACK IS:"+a[top]);
    }
}    
class m
{
    public static void main(String[]args)
    {
        int n;
        stack o =new stack();
        Scanner d=new Scanner(System.in);
        do{
        System.out.println("1.push,2.pop,3.display,4.EXIT");
        System.out.println("Enter the number:");
        n=d.nextInt();
        switch(n)
        {
            case 1:
            o.push();
            break;
            case 2:
            o.pop();
            break;
            case 3:
            o.display();
            break;
            default:
                System.out.println("Exit:");
                break;
        }       

        }while(n>=4 && n<0);
    }
}
