import java.util.*;
class linear
{
     int i,n,se;
    int a[]=new int[100];
    Scanner d=new Scanner(System.in);
    void input()
    {
    System.out.println("ENTER THE NUMBER:");
    n=d.nextInt();
    for(i=0;i<n;i++)
    {
    System.out.print("ENTER THE NUMBER IN THE ARRAY:");
    a[i]=d.nextInt();
    }
    System.out.println("enter the search element:");
    se=d.nextInt();
    }
    void search()
    {
    for(i=0;i<n;i++)
    {
        if(se==a[i])
        break;
    }
    }
    void display()
    {
    if(i<n)
    System.out.println("THE GIVEN SEARCH ELEMENT IS FOUND:");
    else
    System.out.println("THE GIVEN SEARCH ELEMENT IS NOT FOUND:");
    }
}
class m
{
    public static void main(String[]args)
    {
        linear o=new linear();
        o.input();
        o.search();
        o.display();
    }
}