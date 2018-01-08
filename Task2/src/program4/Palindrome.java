package program4;
import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter the name");
		Scanner in = new Scanner(System.in);
		String str=in.nextLine();
		in.close();
		int len=str.length();
		String rev = "";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		if(str.equals(rev))
		System.out.println("The given name is palindrome");
		else
			System.out.println("The given name is not palindrome");
		

	}

}
