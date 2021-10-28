package Time_Complexity;

public class MergeSorting_time {

	public static void main(String[] args) {

		for(int n = 10; n < 10000000 ; n = n * 10 )
		{
			int input [] = new int [n];
			for(int i = 0 ; i < input.length ; i++)
			{
				input[i] = input.length - i;
			}
			
//			function to calculate time is : System.currentTimeMillis();
			
			long startTime = System.currentTimeMillis();
			mergesort(input);
			long endTime = System.currentTimeMillis();
			
			System.out.println("Time taken for "+n+" : "+(endTime - startTime));
		}
	}
	
	public static  void mergesort(int []a)
	{
		 mergesort(a,0,a.length-1);
	}
	
	public static void mergesort(int []a,int sI, int eI)
	{
		if(sI >= eI)
			return;
		
		int mid = (sI + eI)/2;
		
		// part 1
		mergesort(a,sI,mid);
		
		//part 2
		mergesort(a,mid+1,eI);
		
		merge(a,sI,eI);
	}
	
	private static void merge(int []a,int sI,int eI)
	{
		int i = sI;
		
		int mid = (sI + eI)/2;
		
		int j = mid + 1;
		int k = 0;
		
		int ans [] = new int [eI - sI + 1];
		while(i <= mid && j <= eI)
		{
			if(a[i] < a[j])
			{
				ans[k] = a[i]; 
				i++; 
				k++;
			}
			
			else
			{
				ans[k] = a[j]; j++; k++;
			}
		}
		
		while(i <= mid)
		{
			ans[k] = a[i]; i++; k++;
		}
		
		while(j <= eI)
		{
			ans[k] = a[j]; j++; k++;
		}
		
		for(int index = 0; index < ans.length ; index++)
			a[index + sI] = ans[index]; 
	}
}