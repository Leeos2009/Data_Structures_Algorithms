
public class Sorting_Algorithms {
	public static void main(String[]args)
	{
		Sorting_Algorithms a3 = new Sorting_Algorithms();

	   // System.out.print("Before: ");		printArray(a3);
     	a3.testSpeed(10);
	   // System.out.print("After: ");		printArray(a3);

		//printArray(a3);
     	a3.testSpeed(99);
		//System.out.print("After: ");		printArray(a3);

		//printArray(a3);
     	a3.testSpeed(100);
		//System.out.print("After: ");		printArray(a3);

		//printArray(a3);
     	a3.testSpeed(101);
		//System.out.print("After: ");		printArray(a3);

		//printArray(a3);
     	a3.testSpeed(500);
     //	System.out.print("After: ");		printArray(a3);
     	a3.testSpeed(5000);
	}
	public double[] checkSort(double[] arr)
	{
		if (arr.length<102)	printArray(arr);
	    for(int i=0; i<arr.length-1; i++){
		    if (arr[i] > arr[i+1])
		    {
		    	for(int j=0; j<arr.length; j++){
		    		if (j==i)System.out.print("###");
		    		if (j==i+2)System.out.print("###");
		    		System.out.print(arr[j] + " ");
		    	}
		    	System.out.println();
		    	System.out.println();
		    	System.out.printf("!!!!! Array is not sorted, value at index %d is bigger than the next value\n", i);
		    	System.out.println();
		    	break;
		    }
		}
		return arr;
	}
	void testSpeed(int size)
	{
		double[] arr = createArray(size);
		long start = System.nanoTime();
		mergeInsertSort(arr,0,arr.length);
		long end = System.nanoTime();
		long timeToRun = end-start;
		System.out.println("Time in nanseconds for array size "+size+": "+timeToRun);

		checkSort(arr); // If array is not sorted it will print an error
		//if (arr.length<102)	printArray(arr);
	}

	public double[] createArray(int numElements)
	{
		double[] myArray = new double[numElements];
	    for(int i=0;i<numElements;i++){
		    myArray[i] = Math.random()*100;
		}
		return myArray;
	}
	public void merge(double[] arr, int lo, int mid, int hi) {
		int i = lo;
		int j = mid;
		
		double temp[] = new double[hi - lo];
		int t = 0;
		
		while(i < mid && j < hi) {
			if(arr[i] <= arr[j]) {
				temp[t] = arr[i]; 
				i++;
				t++;
			}
			else {
				temp[t] = arr[j];
				j++;
				t++;
			}
		}
		while(i < mid) { 
			temp[t] = arr[i];
			i++;
			t++;
		}
		while(j < hi) {
			temp[t] = arr[j];
			j++;
			t++;
		}
		i = lo;
		t=0;
		while(t < temp.length) {
			arr[i] = temp[t];
			i++;
			t++;
		}
	}
	
	public void insertSort(double[] arr, int start, int end) {
		//end = arr.length;
		 int i = start + 1;
		while(i < end) {
			int j = i;
			while(j > 0 && arr[j] < arr[j-1]) {
				double temp = arr[j];
				arr[j] = arr[j-1];
				arr[j - 1] = temp;
				j--;
			}
			i++;
			//arr[j] = temp;
		}
	}
	
	public void mergeInsertSort(double[] arr, int lb, int ub) {
		if(ub - lb <= 100) {
			insertSort(arr, lb, arr.length);
		}
		else {
			int mid = (ub + lb) / 2;
			mergeInsertSort(arr, lb, mid);
			mergeInsertSort(arr, mid, ub);
			merge(arr, lb, mid, ub);
		}
	}
	
	public void printArray(double[] myArray)
	{
		for(int j=0;j<myArray.length;j++){
			System.out.print(myArray[j]+" ");
		}
		System.out.println();
	}
	
	
	
}
