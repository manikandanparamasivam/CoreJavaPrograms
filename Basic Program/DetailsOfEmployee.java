import java.util.*;

class Employee
{
String employeeID;
String name;
int age;
long salary;
long phoneNumber;

void yearofExperience()
{
System.out.println("5 years experience");
}
}
class DetailsOfEmployee
{
public static void main(String[] args)

{

Employee e1=new Employee();
String e,n;
int a;
long s,p;

Scanner scan=new Scanner(System.in);

System.out.println("enter youremployeeID");
e=scan.nextLine();

System.out.println("enter Name");
n=scan.nextLine();

System.out.println("enter age");
a=scan.nextInt();

System.out.println("enter salary");
s=scan.nextLong();

System.out.println("enter phoneNumber");
p=scan.nextLong();

e1.employeeID=e;
e1.name=n;
e1.age=a;
e1.salary=s;
e1.phoneNumber=p;

System.out.println(e+"\t"+n+"\t"+a+"\t"+s+"\t"+p);



Employee e2=new Employee();
String ee,n1;
int a1;
long s1,p1;


System.out.println("enter youremployeeID");
ee=scan.nextLine();

System.out.println("enter Name");
n1=scan.nextLine();

System.out.println("enter age");
a1=scan.nextInt();

System.out.println("enter salary");
s1=scan.nextLong();

System.out.println("enter phoneNumber");
p1=scan.nextLong();

e2.employeeID=ee;
e2.name=n1;
e2.age=a1;
e2.salary=s1;
e2.phoneNumber=p1;

System.out.println(e1+"\t"+n1+"\t"+a1+"\t"+s1+"\t"+p1);

}
}