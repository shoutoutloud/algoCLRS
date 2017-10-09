package heap;

public class MinHeap {
	 int heapSize;
	private int[] A;
	public MinHeap(int[] A,int s){
		this.heapSize = s;
		this.A = A;
	}
	
	
	public void MinHeapify(int i){
		if(i >= (heapSize-1)/2 ){
			return;
		}
		
		if(i <0 || i > heapSize - 1){
			throw new IndexOutOfBoundsException();
		}
		int l = 2*i + 1;
		int r = 2*i + 2;
		int smallest = 0;
		if(l < heapSize  && A[l] < A[i]){
			smallest = l;
		}
		else{
			smallest = i;
		}
		if( r < heapSize  && A[r] < A[smallest]){
			smallest = r;
		}
		if(smallest!=i){
			this.swap(i,smallest);
			this.MinHeapify(smallest);
		}
	}
	
	public void swap(int x, int y){
		int temp = this.A[x];
		this.A[x] = this.A[y];
		this.A[y] = temp;
	}
	
	
	public void buildMinHeap(){
		for(int i = (heapSize-2)/2; i >=0;i--){
			this.MinHeapify(i);
		}
	}
	
	public int extractMin(){
		if(heapSize < 1){
			throw new IndexOutOfBoundsException();
		}
		this.buildMinHeap();
		int min = A[0];
		A[0] = A[heapSize - 1];
		heapSize = heapSize - 1;
		this.MinHeapify(0);
		return min;
	}
	
	public void decreaseKey( int index, int key){
		if(key > A[index]){//we want to change the value with only the smaller number 
			System.out.println("error");
		}
		else{
				this.A[index] = key;
				for(int i =0; i <A.length;i++)
					System.out.println(A[i]);
				
			while( index > 0 && this.A[(index - 1)/2] > this.A[index] ){
				int temp = this.A[index];
				System.out.println("the value of the temp is " + temp);
				this.A[index] = this.A[(index-1)/2];
				this.A[(index-1)/2] = temp;
				
				
				
				
				index = (index- 1)/2;
			}
			for(int i =0; i <A.length;i++)
				System.out.println(A[i]);
			
		}
	
	}
	
	//insert an element in the heap
		public void insert(int key){
			if(heapSize == A.length){
				System.out.println("overflow condition");
			}
			else{
				heapSize = heapSize + 1;
				this.A[heapSize - 1] = Integer.MAX_VALUE;
				System.out.println(this.A[heapSize-1]);
				this.decreaseKey(heapSize-1, key);
				//debuging
				for(int i =0; i <A.length;i++)
					System.out.println(A[i]);
			}
		}
	
	public int getElement(int i){
		return A[i];
	}
	
	
	
	
	
	
	

}
