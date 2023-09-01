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
         int start=0;
         int end=n-1;
    while(start<=end)
    { 
      int mid=(start+end)/2;
      if(a[mid]==se)
      break;
      else if(a[mid]<se)
      start=mid+1;
      else
      end=mid-1;
    }
    }
    void display()
    {
     int start=0;
    int end=n-1;
    if(start<=end)
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