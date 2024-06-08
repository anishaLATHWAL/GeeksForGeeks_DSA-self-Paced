// import java.io.*;
import java.util.*;

class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); 
        
        while (T-- > 0) {
            Hanoi obj = new Hanoi();
            int N = sc.nextInt(); 
            
            System.out.println(obj.toh(N, 1, 3, 2));
        }
        
        sc.close();
    }
}
// User function Template for Java


// avoid space at the starting of the string in "move disk....."
class Hanoi {
    // Function to solve Tower of Hanoi
    public static long toh(int N, int from, int to, int aux) {
        if (N == 1) {
            System.out.println("move disk 1 from rod " + from + " to rod " + to);
            return 1;
        }
        
  
        long moves = toh(N - 1, from, aux, to);
        
        System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
        moves++;
        
        moves += toh(N - 1, aux, to, from);
        
        return moves;
    }
}
