package program6;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner in = new Scanner(System.in);
		int num=in.nextInt();
		in.close();
		int res=1;
		for (int i=num;i>1;i--)
		{
			res=res*i;
		}
		System.out.println("Factorial of"+num+"="+res);

	}

}
