class deleteElement
{
	public static void main(String[] args)
	{
		int arr[]={1,3,5,6,7,12,45};
		int delete=12;
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
		 if(delete==arr[i])
		 {
			for(int j=i;j<n-1;j++)
			{
				arr[j]=arr[j+1];
			}
			break;
		
		 }
		}
		for(int i=0;i<n-1;i++)
		{
		System.out.println(arr[i]);
		}
	}
}

				