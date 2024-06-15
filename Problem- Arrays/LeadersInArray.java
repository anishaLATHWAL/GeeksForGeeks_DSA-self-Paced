import java.util.ArrayList;
import java.util.Collections;

    // This commit includes only the leaders function. 
    // The rest of the implementation and context is present in the 
    // GeeksforGeeks (GFG) code editor.

public class LeadersInArray {
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here
        ArrayList<Integer> copy = new ArrayList<Integer>();
        int currLeader = arr[n-1];
        copy.add(currLeader);
        
        for(int i = n-2;i>=0;i--){
            if(arr[i]>currLeader || arr[i]==currLeader){
                currLeader = arr[i];
                copy.add(currLeader);
            }
        }
        Collections.reverse(copy);
        return copy;
        
    }
}
