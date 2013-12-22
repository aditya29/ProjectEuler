public class Euler1{

     public static void main(String []args){
        int inputNum = Integer.parseInt(args[0]);
        
        //System.out.println(inputNum);
        
        int sumOf3s = 0;
        int sumOf5s = 0;
        int sumOf15s = 0;
        
        for(int i = 1; i < inputNum; i++)
        {
            if(isMultOf3(i))
            {
                sumOf3s += i;
            }
            if(isMultOf5(i))
            {
                sumOf5s += i;
            }
            if(isMultOf15(i))
            {
                sumOf15s += i;
            }
        }
        
        System.out.println("Sum of multiples of 3 < " + inputNum + " is " + sumOf3s);
        System.out.println("Sum of multiples of 5 < " + inputNum + " is " + sumOf5s);
        System.out.println("Sum of multiples of 15 < " + inputNum + " is " + sumOf15s);
        
        int result = sumOf3s + sumOf5s - sumOf15s;
        
        System.out.println("The result you want is " + result);
     }
     
     private static boolean isMultOf3(int x)
     {
         return x % 3 == 0;
     }
     
     private static boolean isMultOf5(int x)
     {
         return x % 5 == 0;
     }
     
     private static boolean isMultOf15(int x)
     {
         return x % 15 == 0;
     }
}
