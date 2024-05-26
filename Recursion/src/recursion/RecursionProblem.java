package recursion;


public class RecursionProblem{
	public static void main(String[] args) {
//		 fibboSeries(15, 0, 0, 1);
		System.out.println(powerOfVariable(0,0));
	}
	 
	
// 0 1 1 2 3 5
	static void fibboSeries(int n, int count, int prev, int next) {
		if (count== (n-2)) {
//			System.out.print(", "+(next +prev));
			return;
		}
		if (count== 0) {
			System.out.print(prev+", "+next );
		}
		count++;
//		int x =0;
//		x= next;
//		next =  next+prev;
//		System.out.print(", "+next );
//		prev= x;
//		fibboSeries(n, count, prev,next );
		
		int x =0;
		x =  next+prev;
		System.out.print(", "+x );
		
		fibboSeries(n, count, next,x );
	}
	
	static long powerOfVariable(int power,long value) {
//		System.out.println(value);
		if (power ==0) 
			return 1;
		if (value ==0) 
			return 0;

		if(power ==1 )
			return value;
		else {
			
		return powerOfVariable(power-1, value*value);
	
		}
	}
}