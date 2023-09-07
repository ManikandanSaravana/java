import java.util.*;
class string 
{
    String s1,s2;
    Scanner d=new Scanner(System.in);
    void concatenation()
    {
        System.out.println("ENTER THE STRING 1:");
        s1=d.nextLine();
        System.out.println("ENTER THE STRING 2:");
        s2=d.nextLine();
        System.out.println("concatination of the two string:");
        System.out.println("USING + OPERATOR:");
        System.out.println(s1+s2);
        System.out.println("USING concatenation:");
        System.out.println(s1.concat(s2));
    }
    void functions()
    {
       System.out.println("ENTER THE STRING 1:");
        s1=d.nextLine();
        System.out.println("ENTER THE STRING 2:");
        s2=d.nextLine();
        if(s1.equals(s2)==true)
        {
            System.out.println("The Strings are Same:");
        }  
        else{
            System.out.println("The strings are not same:");
        }
        System.out.println("THE LENGTH OF THE STRING S1 is:"+(s1.length()));
        System.out.println("THE LENGTH OF THE STRING S2 is:"+(s2.length()));
        System.out.println("UPPER CASE OF STRING S1:"+(s1.toUpperCase()));
        System.out.println("LOWER CASE OF STRING S2:"+(s1.toLowerCase()));
        
    }
    
}
class main{
    public static void main(String[]args)
{
   string o=new string();
   o.concatenation();
   o.functions();
}
}