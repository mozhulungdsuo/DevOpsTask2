package program8;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Enter first number");
		Scanner in = new Scanner(System.in);
		int num1=in.nextInt();
		System.out.println("Enter second number");		
		int num2=in.nextInt();
		System.out.println("Enter operator");
		char ch=in.next().charAt(0);
		in.close();
	switch(ch)
	{
	case '+':int res=num1+num2;
	         System.out.println(num1 +"+" +num2+"="+res);
	         break;
	case '-':int res1=num1-num2;
	         System.out.println(num1 +"-" +num2+"="+res1);
             break;
	case '*' : int res2=num1*num2;
	           System.out.println(num1+"*"+num2+"="+res2);
	           break;
	case '/': try
	            {
		             int res3=num1/num2;
                     System.out.println(num1+"/"+num2+"="+res3);      
		
	            } catch(ArithmeticException e)
	            	{
	         e.printStackTrace();
	                }

	}

}
}
 
