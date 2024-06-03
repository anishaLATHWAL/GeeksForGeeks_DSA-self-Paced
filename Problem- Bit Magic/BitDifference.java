
public class BitDifference {
    // ......
}

// Solution:
class Solution{
    
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b){
        
        // Your code here
        int xor = a^b;
        
        int count=0;
        while (xor>0){
            xor = (xor & (xor-1));
            count = count+1;
        }
        return count;
        
    }
    
    
}