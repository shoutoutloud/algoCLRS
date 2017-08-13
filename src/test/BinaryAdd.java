package test;
import add.*;

public class BinaryAdd {

	public static void main(String[] args) {
		int ip1[] = {1,1,1,0,1};
		int ip2[] = {1,0,1,0,1,1};
		int sum[];
		Binary b = new Binary(ip1,ip2);
		sum = b.sum();
		
		System.out.println("the sum is");
		for(int k = 0;k < sum.length;k++){
			System.out.print(sum[k]);
			
		}

	}

}
