
// Further Code in IDE

class Solution
{
    public static int exactly3Divisors(int N) {
        
        if(N == 1) return 0;
        
        int count = 0;
        
        for(int n=2; n * n <= N; n++) {
            boolean out = isPrime(n);
            if(out) count++;
        }
        return count;
    }
    public static boolean isPrime(int n) {
        if(n == 1) return false;
        if(n == 2 || n == 3) return true;
        if(n%2 == 0 || n%3 == 0) return false;
        for(int i=5; i * i <= n; i = i+6) {
            if(n%i == 0 || n%(i+2) == 0) return false;
        }
        return true;
    }
}
