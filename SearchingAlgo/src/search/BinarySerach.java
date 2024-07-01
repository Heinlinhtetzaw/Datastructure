package search;

public class BinarySerach {

	public static void main(String[] args) {
		int arr[]= {11,22,33,44,55,66,77,88,99,100};
		int target=77;
		int result=0;
		result= Binary(arr,target);
		if( result==-1) {
			System.out.println("Item is not found.");
		}else
			System.out.println("Array index"+result+" is target 77.");	

	}
	public static int Binary(int A[],int key)
	{
		int left=0;
		int right=A.length-1;
		while(left<right) {
			int mid=((left+right)/2);
			if(A[mid]==key) {
				return mid;
			}else if(A[mid]<key) {
				left=mid+1;
			}else
				right=mid-1;
		}
		return -1;
	}

}
