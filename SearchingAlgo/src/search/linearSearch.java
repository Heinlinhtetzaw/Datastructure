package search;
import java.util.*;
public class linearSearch{

		
		public static void main(String[] args) {
			int arr[]= {12,48,25,36,45,98,17,36,48,69};
			int target;
				System.out.print("Enter search key: ");
				Scanner s=new Scanner(System.in);
				target=s.nextInt();
				int result= Linear(arr,target);
				if(result==1)
					System.out.println("Target not found.");
					else
						System.out.println("Target is found at index " +result);
					}
		public static int Linear(int a[],int key) 			//function
		{
			int i;
				for(i=0;i<a.length;i++) {
					if(a[i]==key)
						return i;
					}
				return -1;
	}
}
