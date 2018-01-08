package program9;

public class CopyArray {

	public static void main(String[] args) {
		int[] old= {1,2,3,4};
		int[] newarray=null;
		System.out.println("Old array contents");
		for(int i=0;i<old.length;i++)
				{
			          System.out.print(old[i]+" ");
			
				}
		
		newarray=old.clone();
		
	 System.out.println("\nNew array contents");
	 for(int i=0;i<newarray.length;i++)
	 {
		 System.out.print(newarray[i]+" ");
		 
	 }
		
	}

}
