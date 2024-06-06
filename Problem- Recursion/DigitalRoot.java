public class DigitalRoot {
    public static void main(String[] args){
        System.out.println(digitalRoot(9999));
    }
    // complete the function

    // solution: 
    public static int digitalRoot(int n)
    {
        // add your code here
        if (n < 10) {
            return n;
        }
        
        // Calculate the sum of digits of n
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return digitalRoot(sum);
    
}
}
