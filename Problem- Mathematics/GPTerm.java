
// Further code in IDE....

class Solution
{
    
    public double termOfGP(int A,int B,int N)
    {
        double ratio = (double)B / (double)A;
        return A * Math.pow(ratio,N-1);
    }

}
