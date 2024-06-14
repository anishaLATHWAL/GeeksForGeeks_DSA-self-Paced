import java.util.ArrayList;

// This commit includes only the stockBuySell function. 
// The rest of the implementation and context are present in the 
// GeeksforGeeks (GFG) code editor.

public class StockBuyAndSell {
    ArrayList<ArrayList<Integer> > stockBuySell(int arr[], int n) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        
        for(int i=1; i<n;i++){
            if(arr[i]>arr[i-1]){
                // profit = profit + arr[i]-arr[i-1];
                
                ArrayList<Integer> problem = new ArrayList<>();
                problem.add(i-1);
                problem.add(i);
                result.add(problem);
            }
        }
        return result;
    }
}
