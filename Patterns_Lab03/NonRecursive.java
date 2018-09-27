public class NonRecursive extends SortFactory{
	@Override
	public SortingAlgorithm getAlgorithm(){
		 if(algorithm == "Insertion")
			 return new Insertion();
		 else if(algorithm == "SelectionSort")
			 return new SelectionSort();
		return null;
	 }
}
