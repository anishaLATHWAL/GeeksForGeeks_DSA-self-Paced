// This commit includes only the countOnes function. 
// The rest of the implementation and context are present in the 
// GeeksforGeeks (GFG) code editor.

int countOnes(int arr[], int n)
    {
        
        // Your code here
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<1){
                high=mid-1;
            }
            else if(arr[mid]>1){
                low=mid+1;
            }
            else{
                if(mid == n-1 || arr[mid+1] != 1){
                    return mid+1;
                }
                else{
                    low=mid+1;
                }
                
            }
        }
        return 0;
    }