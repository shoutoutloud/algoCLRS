package heap;

public class MaxHeap {
	private int heapSize;
	private int[] A;
	public MaxHeap(int[] Arr, int length){
		this.A = Arr;
		this.heapSize = length;
	}
	
	//check for the greater between parent node and the child node and does the swaping
	public void MaxHeapify(int[] A,int i){
		int l = 2*i + 1;
		int r = 2*i + 2;
		int largest;
		if(l < heapSize && A[l] >A[i]){
			largest = l;
		}
		else{
			largest = i;
		}
		if(r < heapSize && A[r] > A[largest]){
			largest = r;
		}
		if(largest != i){
			swap(A,i,largest);
			MaxHeapify(A,largest);
		}
		
	}
	
	//swaps the parent and the child node whenever needed
	private void swap(int[] A,int i, int largest){
		int p = A[i];
		A[i] = A[largest];
		A[largest] = p;
	}
	
	
	//calls the function on all the non leaves to cret the max heap
	public void buildMaxHeap(){
		for(int i = A.length/2; i >=0;i--){
			this.MaxHeapify(A, i);
		}
	}
	
	//extract the maximum of the heap
	public int extractMax(){
		if(heapSize < 1){
			System.out.println("underflow");
		}
		int max = A[0];
		A[0] = A[heapSize - 1];
		this.MaxHeapify(A, 0);
		heapSize = heapSize - 1;
		return max;
	}
	
	
	//insert a greater element at the given index
	public void increaseKey(int[] A, int index, int key){
		if(key < A[index]){//we want to change the value with only the greater number 
			System.out.println("error");
		}
		else{
				A[index] = key;
			
			while( index > 0 && A[(index - 1)/2] < A[index] ){
				this.swap(A, index, (index-1)/2);
				index = (index- 1)/2;
			}
		}
	}
	
	//decreasing the key at given index
	public void decreaseKey(int[] A,int index, int key){
		if(key > A[index]){//we want to change the value with only the greater number 
			System.out.println("error");
		}
		else{
			A[index] = key;
			this.MaxHeapify(A, index);
		}
	}
	
	//insert an element in the heap
	public void insert(int[] A,int key){
		if(heapSize == A.length){
			System.out.println("overflow condition");
		}
		else{
			heapSize = heapSize + 1;
			A[heapSize - 1] = Integer.MIN_VALUE;
			this.increaseKey(A,heapSize-1, key);
		}
	}
	
	
	//heapSort
	public void heapSort(){
		this.buildMaxHeap();
		for(int i = A.length-1; i >=1;i--){
			this.swap(A, i, 0);
			heapSize = heapSize -1;
			this.MaxHeapify(A, 0);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
