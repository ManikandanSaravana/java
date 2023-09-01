import java.util.*;
class bubblesort
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
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-1;j++)
            {
                if (a[j]>a[j+1])
                {
                    c=a[j];
                    a[j]=a[j+1];
                    a[j+1]=c;
                }
            }
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