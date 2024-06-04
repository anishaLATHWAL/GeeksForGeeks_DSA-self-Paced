
public class PowerOfNumbers {
    /*
    Given a number and its reverse. Find that number raised to the power of its own reverse.
    Note: As answers can be very large, print the result modulo 109 + 7.
     */
    public static void main(String[] args) {
        System.out.println(power(12,21)); // number & its reverse.
    }
    public static long power(int N,int R)
    {
        if(R==1)return N;
        if(R%2==0){
            long y=power(N,R/2);
            return (y*y)%1000000007;
        }
        return (N*power(N,R-1))%1000000007;
    }
}
