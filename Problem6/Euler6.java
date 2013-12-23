/**
 * Find the difference between the sum of the squares of the first one hundred natural numbers
 *  and the square of the sum.
 * @author aditya29
 *
 */
public class Euler6 {
	public static void main (String args[])
	{
		int n = 100;
		
		int sumFirstN = n*(n+1)/2;
		System.out.println("Sum of first 100 number: " + sumFirstN);
		
		int squaredSumFirstN = sumFirstN*sumFirstN;
		System.out.println("Square of sum of first 100 numbers: " + squaredSumFirstN);
		
		int sumOfSquares = 0;
		
		for(int i = 1; i <= n; i++)
		{
			sumOfSquares += i*i;
		}
		
		System.out.println("Sum of squares: " + sumOfSquares);
		
		System.out.println(-sumOfSquares+squaredSumFirstN);
	}
}
