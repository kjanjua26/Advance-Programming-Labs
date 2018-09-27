public class SortingManager {
	public static void main(String[] args) {
		String elems_selection[] = {"beta", "chi", "alpha", "zeta", "nu", "mu"};
		String elems_insertion[] = {"kamran", "raja", "ali", "boja", "steve"};
		SortFactory factory = new NonRecursive();
		factory.setFactory("SelectionSort");
		SortingAlgorithm algorithm = factory.getAlgorithm();
		algorithm.sort(elems_insertion);
		System.out.println("The elements sorted by insertion sort are: ");
		for(int i = 0; i < elems_insertion.length; i++)
			System.out.print(elems_insertion[i] + ' ');
		
		System.out.println();
		
		factory.setFactory("Insertion");
		SortingAlgorithm algorithm_ = factory.getAlgorithm();
		algorithm_.sort(elems_selection);
		System.out.println("The elements sorted by selection sort are: ");
		for(int i = 0; i < elems_selection.length; i++)
			System.out.print(elems_selection[i] + ' ');
	}

}
