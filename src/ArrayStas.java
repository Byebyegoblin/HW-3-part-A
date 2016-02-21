import java.util.Random;

public class ArrayStas {
	
	private int[] numbers;
	private int number;

	public void sort(int[] values) {
		// check for empty array
		if (values ==null || values.length==0){
			return;
		}
		this.numbers = values;
		number = values.length;
		quicksort(0, number - 1);
	}

	private void quicksort(int low, int high) {
		int i = low, j = high;
		// Get the pivot element from the middle of the list
		int pivot = numbers[low + (high-low)/2];
		// Divide into two lists
		while (i <= j) {
		// If the current value from the left list is smaller then the pivot
		// element then get the next element from the left list
			while (numbers[i] < pivot) {
				i++;
			}
		    // If the current value from the right list is larger then the pivot
		    // element then get the next element from the right list
		    while (numbers[j] > pivot) {
		        j--;
		    }
		    //If elements are out of order swap elements
		    if (i <= j) {
		    	swap(i, j);
		        i++;
		        j--;
		    }
		 }
		 // Recursively sort the numbers
		 if (low < j){
			 quicksort(low, j);
		 }
		 if (i < high){
		     quicksort(i, high);
		 }
	}
	private void swap(int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
		}
	
	public static void main(String[] args){
		Random rand = new Random();
		int[] array = new int[300];
		for (int index = 0; index <300; index++){
			int value = rand.nextInt(101);
			array[index] = value;
			System.out.println(array[index]);
		}
	}
}
