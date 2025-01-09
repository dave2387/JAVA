import java.util.Scanner;
public class lab1C6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the letter");
		char x = sc.next().charAt(0);
		
		

	if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U')
	{
				System.out.println("given character is wovel");
	}
	else{
			System.out.println("given character is constat");
		}
}
}