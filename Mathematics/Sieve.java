import java.util.*;

public class Sieve {
    void sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        for (int i = 2; i <= n; i++) {
            if (isPrime[i] ) {
                System.out.print(i + " ");
                for (int j = i * i; j <= n; j=j+i) {
                    isPrime[j] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();

        Sieve sieveObj = new Sieve();
        System.out.println("Prime numbers up to " + n + " are:");
        sieveObj.sieve(n);
    }
}
