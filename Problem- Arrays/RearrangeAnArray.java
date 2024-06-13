public class RearrangeAnArray {
    // This commit includes only the arrange function. 
    // The rest of the implementation and context are present in the 
    // GeeksforGeeks (GFG) code editor.
    static void arrange(long arr[], int n)
    {
        // your code here
        long temp[] = new long[n];
        for(int i=0;i<n;i++){
            temp[i] = arr[(int)arr[i]];
        }
        
        for(int i=0;i<n;i++){
            arr[i] = temp[i];
        }
    }
}
