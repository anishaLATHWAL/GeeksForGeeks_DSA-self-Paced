import java.util.*;
public class Factorial {
    static int fact(int n){
        int fact=1;
        while(n>0){
            fact=fact*n;
            n--;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        System.out.println("Factorial of the number "+ num + " : " + fact(num));
        scanner.close();
    }
}


// For large numbers, this can lead to integer overflow, especially for values greater than 12 (since 13! exceeds the maximum value of int). To handle larger factorials, we can use long or BigInteger.
// long cannot handle extremely large factorials (beyond 20!
// import java.math.BigInteger;
// import java.util.Scanner;

// public class Factorial {
//     static BigInteger fact(int n) {
//         BigInteger fact = BigInteger.ONE;
//         while (n > 0) {
//             fact = fact.multiply(BigInteger.valueOf(n));
//             n--;
//         }
//         return fact;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int num = scanner.nextInt();
//         System.out.println("Factorial of the number " + num + " : " + fact(num));
//         scanner.close();
//     }
// }
