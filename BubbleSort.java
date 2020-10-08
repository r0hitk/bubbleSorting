package bubbleSorting;

class BubbleSort {

	static void sort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = array.length-1; j >= i + 1; j--) {
				if (array[j] < array[j - 1]) {
					swap(array, j, j - 1);
				}
			}
		}

	}

	private static void swap(int[] array, int j, int i) {

		int temp;
		temp = array[j];
		array[j] = array[i];
		array[i] = temp;
		
	}

}
