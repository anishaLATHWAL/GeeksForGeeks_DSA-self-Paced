
class Solution{
    public int digitsInFactorial(int N){
        if(N<0){
            return 0;
        }
        if(N<=1){
            return 1;
        }
        
        double d=0;
        
        for (int i=2; i<=N; i++){
            d += Math.log10(i);  // log(q!) = log(1 x 2 x 3 x 4 x … q) = log(1) + log(2) + log(3) + log(4) + … + log(q)
        }
        return (int) Math.floor(d) + 1;  // (log10 of number k) + 1 is the total number of digits present in the number k.
    }
}