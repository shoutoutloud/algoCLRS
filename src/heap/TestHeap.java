package heap;

public class TestHeap {
	public static void main(String[] str){
		//int[] A = {1,14,10,8,7,9,3,2,4,6};//for building heap
		//int[] A = {9,6,5,0,8,2,1,3};//for extracting max
		/*int[] A = {100,30,20,1,3,10,15};//heap for increasing and decreasing the element at index
		MaxHeap mh = new MaxHeap(A,A.length);*/
		//mh.MaxHeapify(A, 0);//maxheapifying
		//mh.buildMaxHeap();
		
		//printing the data after building the max heap
		/*for(int i = 0; i <A.length;i++){
			System.out.println(A[i]);
		}*/
		
		
		//printing the data after extracting the maximum
		/*int m = mh.extractMax();
		System.out.println("the max is " + m);
		for(int i = 0; i <A.length-1;i++){
			System.out.println(A[i]);
		}*/
		
		
		//increasing the key at index 4 
		/*mh.increaseKey(A, 4, 300);
		for(int i = 0; i <A.length;i++){
			System.out.println(A[i]);
		}
		*/
		//decreasing the value at index 1
		/*mh.decreaseKey(A, 1, 2);
		for(int i = 0; i <A.length;i++){
			System.out.println(A[i]);
		}*/
		
		
		//for inserting a new element in the heap
		int[] A = {100,20,30,1,5,10,15,68,99};
		int heapSize = 7;
		MaxHeap mh = new MaxHeap(A,heapSize);
		mh.insert(A, 63);
		for(int i = 0; i <heapSize+1;i++){
			System.out.println(A[i]);
		}
	}

}
