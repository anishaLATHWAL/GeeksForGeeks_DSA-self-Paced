
// Further code in IDE

class Solution {
    public static long sumUnderModulo(long a, long b){
        long mod1 = a % (long)(1000000007);
        long mod2 = b % (long)(1000000007);
        return (long)(mod1+mod2) % (long)(1000000007);
    }   
}

