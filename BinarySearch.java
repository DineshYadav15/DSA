import java .util.*;
class BinarySearch
{
	public static void main(String args[])
	{
		int arr[]={3,5,4,6,8,7};
		Arrays.sort(arr);
		System.out.println("sort the array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(" " + arr[i]);
		}
		int k=77;
		int start=0;
		int end=arr.length-1;
		int mid;
		while(start<=end)
		{
			mid=(start+end)/2;
		if(arr[mid]==k)
		{
			System.out.println("Element present in array index position is = " + mid);
			break;
		}
		else if(arr[mid]<k)
		{
			start=mid+1;
		}
		else
		{
			end=mid-1;
		}
		}
		if(start>end)
		{
			System.out.println("it is not present in array");
		}
		
	}
}
		