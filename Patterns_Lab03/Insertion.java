/**
 * An implementation of the insertion sort algorithm.
 */

public class Insertion implements SortingAlgorithm {
	 public void sort(Object[] items) {
		 int _j;
		 for(int p = 1; p < items.length; p++){
			 Object temp = items[p];
		 for(_j = p; _j > 0 && ((Comparable) items[_j-1]).compareTo(temp) > 0; _j--){
			 items[_j] = items[_j-1];
		 	}
		 items[_j] = temp;
		 }
	 }
}
