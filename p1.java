import java.util.Scanner;
public class p1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks of subject 1");
		int a=sc.nextInt();
		System.out.println("enter the marks of subject 2");
		int b=sc.nextInt();
		System.out.println("enter the marks of subject 3");
		int c=sc.nextInt();
		System.out.println("enter the marks of subject 4");
		int d=sc.nextInt();
		System.out.println("enter the marks of subject 5");
		int e=sc.nextInt();
		int per=(a+b+c+d+e)/5;
		if(a>=60)
		{
			System.out.println("First division");
		}
		else if(a>50 && a<=59)
		{
			System.out.println("Second division");
		}
		else if(a>40 && a<=49)
		{
			System.out.println("Third division");
		}else if(a<40)
		{
			System.out.println("FAIL");
		}
	}
}