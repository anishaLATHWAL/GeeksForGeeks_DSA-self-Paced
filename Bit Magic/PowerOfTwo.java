// Naive Solution
public class PowerOfTwo {
    static boolean isPow2(int n){
        if (n==0){
            return false;
        }
        while(n!=1){
            if(n%2==1){
                return false;
            }
            n=n/2;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isPow2(8));
        System.out.println(isPow2(3));
    }
}


// Efficient Solution
// boolean isPow2(int n){
//     return (n&((n-1))==0);  // time complexity: O(1)
// }