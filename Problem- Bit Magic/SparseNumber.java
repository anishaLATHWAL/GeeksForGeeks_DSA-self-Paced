public class SparseNumber {
    // further code in editor
}

class Solution
{
    //Function to check if the number is sparse or not.
    public static boolean isSparse(int n)
    {
        // Your code here
        if ((n & (n >> 1)) >= 1)
            return false;
 
        return true;
    }
    
}