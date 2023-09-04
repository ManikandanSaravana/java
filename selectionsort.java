import java.util.*;
class selectionsort
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
        int c;
        for(i=0;i<n;i++)
        {
            int v=i;
            for(j=i+1;j<n;j++)
            {
                if (a[v]>a[j])
                {
                   v=j;
                }
            }
             c=a[v];
             a[v]=a[i];
             a[i]=c;
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
        bubblesort o=new bubblesort();
        o.input();
        o.sort();
        o.display();

    }
}   