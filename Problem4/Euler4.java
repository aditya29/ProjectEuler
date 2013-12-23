/**
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

	Find the largest palindrome made from the product of two 3-digit numbers.
 * @author aditya29
 *
 */
public class Euler4 {
	public static void main(String []args)
	{
		int prod = 0;
		int curLargest = 0;
		
		for(int i = 100; i < 1000; i++)
		{
			for(int j = 100; j < 1000; j++)
			{
				prod = i * j;
				
				if(isPalindrome(prod) && prod > curLargest)
				{
					curLargest = prod;
				}
			}
		}
		
		System.out.println(curLargest);
	}
	
	private static boolean isPalindrome(int n)
	{
		char digits[] = String.valueOf(n).toCharArray();
		boolean flag = true;
		int len = digits.length;
		
		for (int i = 0; i < len/2; i++)
		{
			char front = digits[i];
			char back = digits[len-1-i];
			
			if(front == back)
				flag = true;
			else
			{
				flag = false;
				break;
			}
		}
		
		return flag;
	}
}
