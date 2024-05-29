// Naive solution

import java.util.*;
public class HCF {
    static int hcf(int a, int b)
    {
        int res = Math.min(a,b);
        while(res>0){
            if (a%res==0 && b%res==0){
                break;
            }
            res--;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = scanner.nextInt();
        System.out.println("Highest common factor is "+ hcf(num1,num2));
    }
}

// Euclidean algorithm

// int hcf(int a , int b){
//     while(a!=b){
//         if(a>b){
//             return a=a-b;
//         }
//         else{
//             return b= b-a;
//         }
//         return a;
//     }
// }

// More optimised

// int gcd(int a, int b){
//     if(b==0){
//         return a;
//     }
//     else{
//         return gcd(b, a%b);
//     }
// }