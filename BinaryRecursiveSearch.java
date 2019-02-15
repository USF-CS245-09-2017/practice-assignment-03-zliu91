

public class BinaryRecursiveSearch implements Practice03Search{
	public String searchName() {
		return "BinaryRecursiveSearch";
	}

	public int search(int [] arr, int target) {
		return binsearch(arr,target,0,arr.length-1);
	}
	
	public int binsearch(int [] arr, int target, int start, int end) {
		int mid;
		if(end<start) {
			return -1;
		}
		mid = (start+end)/2;
		if(arr[mid]==target){
			return mid; 
		}
		else if(arr[mid]<target) {
			return binsearch(arr,target,mid+1,end);
		}
		else {
			
			return binsearch(arr,target,start,mid-1);
		}
		
	}

}
