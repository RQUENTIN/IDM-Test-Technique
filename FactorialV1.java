
public class FactorialV1 {

	public static void main(String[] args) {
		
		int n;
		if (args.length > 0) {
		        n = Integer.parseInt(args[0]);
		        int result = Factorial(n);
		        System.out.println(result);
		}
	}
	
	public static int Factorial(int n)
	{
		int x, result = 1;
		  for ( x = n; x > 1; x--) {
			  result *= x;
		  }
		  return result;
	}


}
