import java.util.Scanner;
public class p2{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);

	System.out.println("enter the Num1");
	int a=sc.nextInt();
	System.out.println("enter the Num2");
	int b=sc.nextInt();
	System.out.println("enter the operator");
	System.out.println("Add='+',Subtract='-', Multiply='*', Div='/'  ");	
	String c=sc.nextLine();
	String d=sc.nextLine();
	if(d.equals("+"))
	{
		System.out.println(a+b);
	}
	else if(d.equals("-"))
	{
		System.out.println(a-b);
	}
	else if(d.equals("*"))
	{
		System.out.println(a*b);
	}
	else if(d.equals("/"))
	{
		System.out.println(a/b);
	}
}
}