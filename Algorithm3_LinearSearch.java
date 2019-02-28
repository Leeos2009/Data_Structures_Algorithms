
public class Algorithm3_LinearSearch {
	public static void main(String args[]) {
		int A[] = {17,2,8,94,43,7,3,9,12,10};
		System.out.println(LinearSearch(A, 10, 7));
		
	}
		public static int LinearSearch(int A[], int n, int q) {
			int i = 0;
			while(i < n)
			{
				if(A[i] != q)
				{
					i++;
				}
				else if(i == n) {
					return -1;
				}
				else 
					return i;
			}
			return i;
		}
}
