import java.util.*;
class Arith
{


int add(int a,int b)
{
int c=a+b;
return c;

}



int sub(int a,int b)
{
int c=a-b;
return c; 

}


int mul(int a,int b)
{
int c=a*b;
return c;
} 


int div(int a,int b)
{
int c=a/b;
return c;
} 


int mod(int a,int b)
{
int c=a%b;
return c;
} 
}


class ArithmaticMethodSwitch
{
public static void main(String[] args)
{

int num1,num2,result,choice;

Scanner scan=new Scanner(System.in);

Arith obj=new Arith();

System.out.println(" chosse your method\n 1.add\n 2.sub\n 3.mult\n 4.div \n 5.mol");
choice=scan.nextInt(); 

System.out.println("enter value num1");
num1=scan.nextInt();
System.out.println("enter value num2");
num2=scan.nextInt();

switch(choice) 
{
case 1:
result=obj.add(num1,num2);
System.out.println("your add="+result);
break;

case 2:  
result=obj.sub(num1,num2);
System.out.println("your sub="+result);
break;

case 3:  
result=obj.mul(num1,num2);
System.out.println("your mul="+result);
break;

case 4:
result=obj.div(num1,num2);
System.out.println("your dev="+result);
break;

case 5:
result=obj.mod(num1,num2);
System.out.println("your mul="+result);

break;

}
}
}    