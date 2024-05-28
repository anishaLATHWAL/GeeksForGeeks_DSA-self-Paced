import java.util.Scanner;

public class TrailingZerosInAFactorial {
    static int countZeros(int n) {
        int fact = 1;
        while (n > 0) {
            fact = fact * n;
            n--;
        }
        
        // Correct method to count trailing zeros
        int count = 0;
        while (fact % 10 == 0) {
            count++;
            fact = fact / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.println("Number of trailing zeros in " + num + "! is " + countZeros(num));
    }
}
