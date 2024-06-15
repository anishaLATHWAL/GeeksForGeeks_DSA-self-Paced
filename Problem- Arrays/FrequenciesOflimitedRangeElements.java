import java.util.LinkedHashMap;
import java.util.Map;

// This commit includes only the requencyCount function. 
// The rest of the implementation and context is present in the 
// GeeksforGeeks (GFG) code editor.

public class FrequenciesOflimitedRangeElements {
     public static void frequencyCount(int arr[], int N, int p)
    {
        // code here
    
        int count=0;
        Map<Integer,Integer> map=new LinkedHashMap<>();
        for(int i=1;i<=N;i++){
            map.put(i,0);
        }
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                count=map.get(arr[i]);
                count++;
                map.put(arr[i],count);
            }
        }
       
        for(int i=1;i<=map.size();i++){
            arr[i-1]=map.get(i);
            
        }


        // different way...
        
    // int[] count = new int[N];
    // for (int i = 0; i < arr.length; i++) {
    //     if (arr[i] >= 1 && arr[i] <= N) {
    //         count[arr[i] - 1]++;
    //     }
    // }
    
    // for (int i = 0; i < N; i++) {
    //     arr[i] = count[i];
    // }
        
    }
}
