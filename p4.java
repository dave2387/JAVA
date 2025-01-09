import java.util.Scanner;
public class p4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number A");
		int A=sc.nextInt();
        System.out.println("enter the number B");
		int B=sc.nextInt();
        System.out.println("enter the number C");
		int C=sc.nextInt();
        int max = (A > B) ? (A > C ? A : C) : (B > C ? B : C);
        System.out.println("Maximum number is: " + max);
    }
}