
public class Check_KthBitIsOrNot {
    
}

// Code in IDE

class CheckBit
{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {
        // your code here
        if( (n & ( 1 << (k) )) != 0) return true;
        return false;
    }
    
}