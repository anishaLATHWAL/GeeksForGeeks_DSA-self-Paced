import java.util.ArrayList;

// This commit includes only the largestAndSecondLargest function. 
// The rest of the implementation and context are present in the 
// GeeksforGeeks (GFG) code editor.

public class MaxAndSecondMax {

    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        //code here.
        int res = -1;
        int largest = 0;
        for(int i=0;i<sizeOfArray;i++){
            if(arr[i]>arr[largest]){
                res=largest;
                largest=i;
            }
            else if(arr[i] != arr[largest]){
                if(res==-1 || arr[i]>arr[res]){
                    res = i;
                }
            }
        }
        
        ArrayList <Integer> result = new ArrayList<Integer>();
        result.add(arr[largest]);
        if(res==-1){
            result.add(-1);
        }
        else{
            result.add(arr[res]);
        }
        return result;
    }
}
