package program7;
import java.util.Scanner;


public class CheckVowel {

	public static void main(String[] args) {
		System.out.println("Enter a character");
		Scanner in=new Scanner(System.in);
		char ch=in.next().charAt(0);
		in.close();
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':System.out.println (ch + " is a vowel");
		break;
		default:System.out.println(ch + " is a consonant");
		break;
				
		}		

	}

}
