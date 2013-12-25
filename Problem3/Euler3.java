public class Euler3 {
    public static void main(String[] args) {
    long num = 600851475143L;
    int max = (int)Math.sqrt(num) + 1;
    for (int i = 3; i < max; i += 2)
    {
        if (num % i == 0)
        {
            System.out.println(i);
            num /= i;
            max = (int)Math.sqrt(num)+1;
            i -= 2;
        }
    }
    	System.out.println(num);
    }
}