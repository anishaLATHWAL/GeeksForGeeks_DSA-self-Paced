
public class SwalAllOddAndEvenBits {
    // .....
}

// Solution 

class Solution
{
    //Function to swap odd and even bits.
    public static int swapBits(int n) 
    {
	    // Your code
	    int even_bits = n & 0xAAAAAAAA; // extract all the even bits from the integer n.
        int odd_bits = n & 0x55555555;
        even_bits >>= 1;
        odd_bits <<= 1;
        return (even_bits | odd_bits);
	}
    
}