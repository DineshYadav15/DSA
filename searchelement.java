class searchelement
{
	public static void main(String[] args)
	{
		int arr[]={4,3,2,6,8,5};
		int k=5;
		int i=0;
		int n=arr.length;
		for(i=0;i<n;i++)
		{
			if(arr[i]==k)
			{
				System.out.println("Element present in Array index position id = " + i);
				break;
			}
		}
		if(i==n)
		{
			System.out.println("It is not present in array");
		}
	}
}