
public class RightMostDifferenceBit {
    // ......
}

// your code here
class Solution
{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
            
        // Your code here 
        if(m==n){
            return -1;
        }
        int xor = m^n ;
        int diffbit = xor & ~ (xor-1);
        
         int position = (int)(Math.log(diffbit) / Math.log(2)) + 1;
         
        return position;
    }
}