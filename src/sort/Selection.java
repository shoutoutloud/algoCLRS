package sort;

public class Selection {
	public int[] sort(int[] A){
		for(int i = 0;i<A.length-1;i++){
			int sindex =i;
			int smallest = A[i];
			for(int j=i;j<A.length ;j++){
				if(A[j] < smallest){
					smallest = A[j];
					 sindex = j;
				}
			}
			A[sindex] = A[i];
			A[i] = smallest;
		}
		return A;
	}

}
