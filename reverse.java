import java.util.*;
public class reverse
{
public static void main(String[]args)
{
int i;
char c;
String str,str1="";
Scanner s=new Scanner(System.in);
System.out.println("ENTER THE STRING:");
str=s.nextLine();
int length;
length=str.length();
for(i=0;i<length;i++)
{
c=str.charAt(i);
str1=c+str1;
}
System.out.println("THE REVERSE OF THE STRING IS:"+str1);
}
}
 

