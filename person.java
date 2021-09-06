import java.util.Scanner;
class person{
Scanner sc=new Scanner(System.in);
String gend,addres,name;
int age;
person()
{
System.out.println("Person Details:");
System.out.println("Name:");
name=sc.next();
System.out.println("Address:");
addres=sc.next();
System.out.println("Gender:");
gend=sc.next();
System.out.println("Age:");
age= sc.nextInt();
}}
class employee extends person{
int emplid,salry;
String cmpny_name,qualification;
Scanner sc=new Scanner(System.in);
employee()
{
System.out.println("Empolyee Details");
System.out.println("Company Name:");
cmpny_name=sc.next();
System.out.println("Employee ID:");
emplid=sc.nextInt();
System.out.println("Qualification:");
qualification=sc.next();
System.out.println("Salary:");
salry=sc.nextInt();
}}
class teacher extends employee{
Scanner sc=new Scanner(System.in);
String dept,subj;
int teacherID;
teacher(){
System.out.println("Teacher Details:");
System.out.println("Department name:");
dept=sc.next();
System.out.println("Subject:");
subj= sc.next();
System.out.println("Teacher ID:");
teacherID= sc.nextInt();
}
void disp()
{
System.out.println("Details are:");
System.out.println(name);
System.out.println(gend);
System.out.println(age);
System.out.println(cmpny_name);
System.out.println(emplid);
System.out.println(qualification);
System.out.println(teacherID);
System.out.println(addres);
System.out.println(subj);
System.out.println(dept);
System.out.println(salry);
}
}
public class persons {
public static void main(String ...a)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the limit:");
int n=sc.nextInt();
teacher tr[]=new teacher[n];
for (int i=0;i<n;i++)
{
tr[i]=new teacher();
tr[i].disp();
}}}