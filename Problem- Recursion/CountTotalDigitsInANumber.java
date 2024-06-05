public class CountTotalDigitsInANumber {
    /*
     * You are given a number n. You need to find the count of digits in n.

    Example 1:

    Input:
    n = 1
    Output: 1
    Explanation: Number of digit in 1 is 1.
    Example 2:

    Input:
    n  = 99999
    Output: 5
    Explanation:Number of digit in 99999 is 5
     */

    public static void main(String[] args){
        System.out.println(countDigits(234));
    }
    public static int countDigits(int n)
    {
        // add your code here
        if(n==0){
            return 0;
        }
        return 1 + countDigits(n/10); 
    }
}
