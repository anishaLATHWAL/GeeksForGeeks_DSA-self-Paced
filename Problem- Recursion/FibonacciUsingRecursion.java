public class FibonacciUsingRecursion {

    /*You are given a number n. You need to find nth Fibonacci number.
    F(n)=F(n-1)+F(n-2); where F(1)=1 and F(2)=1

    Example 1:

    Input:
    n = 1
    Output: 1
    Explanation: The first fibonacci
    number is 1 */

    public static void main(String[] args){
        fibonacci(5);
    }

    static int fibonacci(int n)
    {
        // your code here
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}


