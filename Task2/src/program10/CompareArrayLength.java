package program10;

public class CompareArrayLength {

	public static void main(String[] args) {
	int first[]= {1,2,3,4,5};
	int second[]= {5,4,2,7,89,6,1,66};
	int result[]=null;
	if(first.length>second.length)
	{
		result=first.clone();
	}
	else
	{
		result=second.clone();
	}
	System.out.println("Contents of longer array");
	for(int i=0;i<result.length;i++)
	{
		System.out.print(result[i]+" ");
	}

	}

}
