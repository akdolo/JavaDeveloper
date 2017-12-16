package www.somereviews.com;

public class BinarySearch {
	
	public int binarySearch(int[] Array, int key){
		int start = 0;
		int end = Array.length - 1;
		while (start <= end){
			int mid = (start + end)/2;
			if (key == Array[mid]){
				return mid;
			}
			if (key < Array[mid]){
				end = mid - 1;
			}else{
				start = mid + 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int[] a = {32, 44, 89, 165, 264, 33, 344, 465};
		System.out.println("The number is in position: " + bs.binarySearch(a, 165));
		
		int[] b = {74, 156, 296, 456, 234, 432, 213};
		System.out.println("The number is in position: " + bs.binarySearch(b, 296));
		
	}
}
