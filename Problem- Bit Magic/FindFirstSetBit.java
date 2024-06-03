
public class FindFirstSetBit {
//     Given an integer N. The task is to return the position of first set bit found from the right side in         the binary representation of the number.
// Note: If there is no set bit in the integer N, then return 0 from the function.  

// Example 1:

// Input: 
// N = 18
// Output: 
// 2
// Explanation: 
// Binary representation of 18 is 010010,the first set bit from the right side is at position 2.
}
class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
            
        // Your code here
        if(n==0){
            return 0;
        }
        int res = 1 ;
        while(n>0){
            if(n%2 != 0){
                return res;
            }
            else{
                 res++;
            }
            n = n / 2;
        }
        return res;
            
    }
}
