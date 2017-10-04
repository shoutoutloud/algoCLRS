package sort;

public class QuickSort {
	
	public static void  pivot(int[] a,int start, int end){
		
		
		
		
	    int s = start;
		int p = end;
		int i = end - 1;
		while(true){
			if(a[i] > a[p]){
				 int temp = a[i];
				 a[i] = a[p];
				 a[p] = temp;
				 p = p -1;
				 i = i - 1;
				 if(s==p)
					 break;
			}
			else{
				if(s==i)
					break;
				int t = a[s];
				a[s] = a[i];
				a[i] = t;
				s = s + 1;
			}
		}
		
		
		
	}
	
	
	 public static void main(String[] str){
		 int[] a = {2,6,3,9,4};
		 pivot(a,0,a.length-1);
		 for(int k = 0; k < a.length; k++){
			 System.out.println(a[k]);
		 }
	 }
	
}
