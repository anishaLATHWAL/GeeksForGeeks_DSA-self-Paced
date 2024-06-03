

public class LongestConsecutive1 {
    // ....
}

class Solution{

    public static int maxConsecutiveOnes(int num) {
        
        // Your code here
        int maxCount = 0; // Initialize the maximum count of consecutive ones
        int currentCount = 0; // Initialize the current count of consecutive ones

        while (num != 0) {
            if ((num & 1) == 1) {
                currentCount++;
            } else {
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 0;
            }

            num >>= 1;
        }

        maxCount = Math.max(maxCount, currentCount);

        return maxCount;
    }
}
