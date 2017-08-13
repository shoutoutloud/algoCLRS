package add;

public class Binary {
	private int n1[] = {0};
	private int n2[] = {0};
	private int sum[] = {0};
	private int c = 0;
	private int temp = 0;
	public Binary(int[] i1,int[] i2){
		int smaller[];
		int larger[];
		if(i1.length > i2.length){
			smaller = i2;
			larger = i1;
		}
		else{
			smaller = i1;
			larger = i2;
		}
		n1=larger;
		n2 = new int[n1.length];
		for(int z = 0; z <= n1.length - smaller.length-1;z++){
			n2[z] = 0;
		}
		for(int z = n1.length - smaller.length,p = 0;z<larger.length;z++,p++){
			n2[z] = smaller[p];
		}
		/*for(int h = 0;h<n1.length;h++){
			System.out.println(n1[h] + " " + n2[h]);
		}*/
		
	}
	
	public int[] sum(){
		sum = new int[n1.length + 1];
		for(int i = n1.length - 1 ; i>=0; i--){
			temp = c + n1[i] + n2[i];
			if(temp > 1){
				sum[i+1] = temp%2;
				c = 1;
				
				//System.out.println("sum is " + sum[i+1]+" carry is "+ c);
			}
			else{
				sum[i+1] = temp;
				c = 0;
				
				//System.out.println("sum is " + sum[i+1]+" carry is "+ c);
			}
		}
		sum[0] = c;
		return sum;
	}

}
