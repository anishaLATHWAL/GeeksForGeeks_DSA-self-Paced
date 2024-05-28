import java.util.*;

public class CountDigits{
    public static int count(int x) {
        // if (x == 0) {
        //     return 1;
        // }
        // x = Math.abs(x);
        int res = 0;
        while (x != 0) {
            x = x / 10;
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close(); 

        int dig = count(number);
        System.out.println("Number of digits in " + number + ": " +dig);
    }
}


// 2nd approach: by converting it to string and then calculating its length

// public class GFG {

//     static void count_digits(int n)
//     {
//         String num = Integer.toString(n);

//         System.out.println(num.length());
//     }

//     public static void main(String args[])
//     {
//         // number
//         int n = 345;
//         count_digits(n);
//     }
// }

