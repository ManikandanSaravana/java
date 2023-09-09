import java.util.*;
class queue
{
    int front=0;
    int rear=0;
    int a[]=new int[5];
    int i,num;
    Scanner d=new Scanner(System.in);
    void enqueue()
    {
       if(rear==4)  
       System.out.println("THE QUEUE IS FULL:");
       else
       {
        System.out.println("ENTER THE NUBER TO BE PUSHED:");
        num=d.nextInt();
        a[rear]=num;
        rear++;
       }     
    }
    void dequeue()
    {
        if(front==rear)
        System.out.println("QUEUE IS EMPTY:");
        else
        {
            System.out.println("THE DEQUEUE OF THE NUMBER IS:"+a[front]);
            front++;
        }
    }
    void display()
    {
        if(front==rear)
        System.out.println("QUEUE IS EMPTY:");
        else
        {
            System.out.println("THE DISPLAY OF THE ELEMENT IS:");
            for(i=front;i<rear;i++)
            System.out.println(a[i]);
        }

    }
}
class main
{
    public static void main(String[]args)
    {
        int ch,press;
        Scanner d=new Scanner(System.in);
        queue o=new queue();
        do{
            System.out.println("1.enqueue 2.dequeue 3.display 4.EXIT");
            System.out.println("Enter your choice:");
            ch=d.nextInt();
            if(ch==1)
            o.enqueue();
            if(ch==2)
            o.dequeue();
            if(ch==3)
            o.display();
            if(ch==4)
            break;
            System.out.println("if you want to continue pree 1:");
            press=d.nextInt();
        }while(press==1);
    }
}
