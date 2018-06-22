package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {6,8,1,55,12,-2};
		selection(num);

		for(int a : num) {
			System.out.println(a);
		}
		
	}

	
	public static void selection(int[] arr) {
		
		int i, j, min;
		
		for(i=0; i<arr.length;i++) {
			min = i;
			
			for(j=i+1; j<arr.length;j++) {
				if(arr[j] < arr[i]) {
					min = j;
				}
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
	}
	
}
