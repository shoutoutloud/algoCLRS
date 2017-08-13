package sort;

public class Insertion {
	private int a[];
	public Insertion(int ip[]){
		a = ip;
	}
	public Insertion(){
		System.out.println("pass an array input");
	}
	
	public int[] sort(){
		
		for(int i = 1;i < a.length; i ++){
			int key = a[i];
			int j = i-1;
			while(j >= 0 && a[j] > key){
				a[j + 1] = a[j];
				j=j-1;
			}
			a[j+1]=key;
		}
		return a;
	}
}
