package program5;
import java.util.Scanner;
public class ArmStrong {

	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner in = new Scanner(System.in);
		int num=in.nextInt();
		in.close();
		int temp=num;
		int lsb,res = 0;
		while(num>0)
		{
			lsb=num%10;
			num=num/10;
			res=res+(lsb*lsb*lsb);			
		}
		if(temp==res)
			System.out.println(temp+" is an Armstrong number");
		else
			System.out.println(temp + " is not an Armstrong number");
		

	}

}
