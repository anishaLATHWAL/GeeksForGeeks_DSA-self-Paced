import java.util.Arrays;

// This commit includes only the Mean and median function. 
// The rest of the implementation and context are present in the 
// GeeksforGeeks (GFG) code editor.

public class MeanAndMedian {
    public int median(int A[],int N)
    {
       //Your code here
       Arrays.sort(A);
       
       if(N%2 != 0){
           return A[N/2];
       }
       else{
          return (A[N/2-1]+A[N/2])/2;
       }
       
       //If median is fraction then conver it to integer and return
    }
    //Function to find median of the array elements.
    public int mean(int A[],int N)
    {
       //Your code here
       int mean =0;
       for(int i=0;i<N; i++){
           mean += A[i];
       }
       return mean/N ;
    }
}
