import java.util.*;

class ArithMeticSwitch

{

public static void main(String[] args)

{


int a,b,result,choice;

Scanner scan=new Scanner(System.in);

System.out.println("1.add\n 2.sub\n 3.mult\n 4.div\n choose your method");
choice=scan.nextInt();

System.out.println("enter your a value");
a=scan.nextInt();

System.out.println("enter your b value");
b=scan.nextInt();  

switch(choice)
{
case 1:
result=a+b;
System.out.println("your add valve="+result);
break;

case 2:
result=a-b;
System.out.println("your sub valve="+result);
break;

case '3':
result=a*b;
System.out.println("your mult valve="+result);
break;

case '4':
result=a/b;
System.out.println("your div valve="+result);
break;
 
default:
System.out.println("plese enter valid option");
break;
}
}
}