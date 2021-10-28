package Time_Complexity;

public class SelectionSorting_time {

	public static void main(String[] args) {

		for(int n = 10 ; n < 10000000 ; n = n *10)
		{
			int input [] = new int [n];
			
			for(int i = 0 ;i < input.length ; i++)
				input[i] = input.length - i;
		
		
		long startTime = System.currentTimeMillis();
		selection(input);
		long endTime = System.currentTimeMillis();
		
		System.out.println("Time taken for "+n+" : "+ (endTime - startTime));  // take too much time for 10 million
		
		}	
	}
	
	public static void selection(int []a)
	{
		for(int i = 0;i < a.length - 1 ;i++)
		{
			int min = a[i]; int minI = i;
			for(int j = i + 1;j < a.length ; j++)
			{
				if(a[j] < min)
				{
					minI = j;
					min = a[j];
				}
			}
			
			a[minI] = a[i];
			a[i] = min;
		}
	}
}