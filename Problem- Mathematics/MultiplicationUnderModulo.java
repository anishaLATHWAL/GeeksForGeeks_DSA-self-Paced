
// Further code in IDE

class Solution
{
    static long multiplicationUnderModulo(long a, long b)
    {
        
        long mul1 = (long)(a) % (long)(1000000007);
        long mul2 = (long)(b) % (long)(1000000007);
        return (long)(mul1*mul2) % (long)(1000000007);
    }
}