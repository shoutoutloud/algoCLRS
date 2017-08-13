package sort;

public class Merge {
	private int[] res;
	
	public void mergeSort(int[] A, int p,int r){
		if(p < r){
			int q = (p+r)/2;
			mergeSort(A,p,q);
			mergeSort(A,q+1,r);
			merge(A,p,q,r);
		}
		
	}
	public void merge(int[] A,int p,int q,int r){
		int n1 = q - p +1;
		int n2 = r - q;
		int l[] = new int[n1+1];
		int rt[] = new int[n2+1];
		for(int i =0;i<n1;i++){
			l[i] = A[p+i];
		}
		for(int j=0;j<n2;j++){
			rt[j] = A[q+j+1];
		}
		l[n1] = 99999;
		rt[n2] = 99999;
		int i=0;
		int j = 0;
		for(int k=p;k<=r;k++){
			if(l[i] <= rt[j]){
				A[k] = l[i];
				i = i+1;
			}
			else {
				A[k] = rt [j];
				j = j+1;
			}
		}
		res = A;
	}
	public void print(){
		for(int i = 0; i< res.length;i++){
			System.out.println(res[i]);
		}
	}
	

}
