import java.io.*;
class A
{
void showA()
{
System.out.println("i am going to");
}
}
class B extends A
{
void showB()
{
System.out.println("my school");
}
}
class  singleheritence
{
public static void main(String args[])
{
A  a=new A();
a.showB();
}
}