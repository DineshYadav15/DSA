class insertElement
{
	public static void main (String[] args)
	{
		int arr[]={2,4,6,7,8,1,2};
		int pos=4;
		int element=34;
		int n=arr.length;
		for(int i=n-1;i>pos-1;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[pos-1]=element;
		System.out.println("insert the array");
		for(int i=0;i<n;i++)
		{
			
			System.out.print(arr[i] + " ");
		}
	}
}