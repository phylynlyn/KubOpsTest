import java.util.Scanner;
public class Fibonacci 
{ 

    public static int fib(int x)
    {
    if (x <= 1)
       return x;
    return fib(x-1) + fib(x-2);
    }
      
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("input : n = ");
        int x = sc.nextInt();       
        System.out.println("output:" + fib(x));
    }
}