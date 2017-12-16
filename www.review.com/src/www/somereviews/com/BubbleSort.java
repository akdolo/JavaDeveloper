package www.somereviews.com;

/*We can create a java program to sort array elements 
 * 	using bubble sort. Bubble sort algorithm is known
 *  as the simplest sorting algorithm.
 *	In bubble sort algorithm, array is
 *	traversed from first element to last element. 
 *	Here, current element is compared with the next 
 *	element. If current element is greater than the next element, it is swapped.
 **/
public class BubbleSort {
	
	static void bubbleSort(int[] arr){
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++){
		for (int j = 1; j < (n-i); j++){
			
			if (arr[j-1] > arr[j]){
				temp = arr[j-1];
				arr[j-1] = arr[j];
				temp = arr[j];
		}
		}
	}
	}
	public static void main(String[] args) {
		int arr[] = {233, 456, 554,983, 567, 98743};
		//int n = arr.length;
		
		System.out.println("Print current array before bubbleSort:" );
		for (int i =0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println();
		bubbleSort(arr);
		System.out.println("Print array after bubble process:");
		for (int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	
}
