import java.util.Scanner;
import java.lang.String;
class greatest
{
public static void main(String[] args)
{
int a,b,c;
Scanner obj=new Scanner(System.in);
System.out.print("Enter three numbers : ");
a=obj.nextInt();
b=obj.nextInt();
c=obj.nextInt();
if(a>b)
{
if(b>c)
{
System.out.println(a+" is greatest");
}
else if(b<c && a>c)
{
System.out.println(a+" is greatest");
}
else if(b<c && a<c)
{
System.out.println(c+" is greatest");
}
}
else if(b>c)
{
if(c>a)
{
System.out.println(b+" is greatest");
}
else if(c<a && b>a)
{
System.out.println(b+" is greatest");
}
else if(c<a && b<a)
{
System.out.println(a+" is greatest");
}
}
else if(c>a)
{
if(a>b)
{
System.out.println(c+" is greatest");
}
else if(a<b && c>b)
{
System.out.println(c+" is greatest");
}
else if(a<b && b<c)
{
System.out.println(b+" is greatest");
}
}
}
}