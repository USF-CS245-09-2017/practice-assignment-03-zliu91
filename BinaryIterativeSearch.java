public class BinaryIterativeSearch implements Practice03Search{
	public String searchName() {
		return "BinaryIterativeSearch";
	}

	public int search(int [] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		int mid;
		while(start<end) {
			mid = (start+end)/2;
			if(arr[mid]==target) {
				return mid;
			} 
			else if(arr[mid]<target) {
				start = mid + 1;
			} 
			else if(arr[mid]>target) {
				end = mid - 1;
			}
		}
		return -1;
	}

}
