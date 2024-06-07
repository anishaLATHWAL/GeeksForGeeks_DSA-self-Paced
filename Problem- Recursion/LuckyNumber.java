
public class LuckyNumber {

    // Public method to determine if a number is lucky
    public static boolean isLucky(int n) {
        return isLuckyHelper(n, 2);
    }

    private static boolean isLuckyHelper(int n, int i) {
        if (n < i) {
            return true;
        }

        if (n % i == 0) {
            return false;
        }

        int newPosition = n - (n / i);

        return isLuckyHelper(newPosition, i + 1);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isLucky(5) ? 1 : 0);  
    }
}

