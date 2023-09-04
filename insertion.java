import java.util.*;
class insertionsort
{
     int i,j,n;
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
    }
    void sort()
    {
        int v;
        for(i=0;i<n;i++)
        {
            v=a[i];
            for(j=i-1;j>=0 && a[j]>v;j--)
            {
                a[j+1]=a[j];
            }
             a[j+1]=v;
        }
    }
    void display()
    {
        System.out.println("THE SORTED ELEMENTS ARE:\n");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
class m
{
    public static void main(String[]args)
    {
        insertionsort o=new insertionsort();
        o.input();
        o.sort();
        o.display();

    }
}   