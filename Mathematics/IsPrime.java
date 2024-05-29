import java.util.*;
public class IsPrime {
    static boolean isPrime(int n){
        if (n==1){
            return false;
        }
        for(int i=2; i*i<n;i++){  // divisors always appear in pairs
            if (n%i==0){
                return false;
            }
        }
    return true;    
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();
        if(isPrime(num)){
            System.out.println(num + " is prime number.");
        }
        else{
            System.out.println(num + " is not a prime number.");
        }
    }
}


// More efficient approach (for large n) we can save many iterations.

// public static boolean isPrime(int n)
// 	{
// 		if (n <= 1)
// 			return false;

// 		// Check if n=2 or n=3
// 		if (n == 2 || n == 3)
// 			return true;

// 		// Check whether n is divisible by 2 or 3
// 		if (n % 2 == 0 || n % 3 == 0)
// 			return false;

// 		// Check from 5 to square root of n
// 		// Iterate i by (i+6)
// 		for (int i = 5; i <= Math.sqrt(n); i = i + 6)
// 			if (n % i == 0 || n % (i + 2) == 0)
// 				return false;

// 		return true;
// 	}