// This commit includes only the leftIndex function. 
// The rest of the implementation and context are present in the 
// GeeksforGeeks (GFG) code editor.

int leftIndex(int n, int arr[], int x){
    
    // Your code here
    int low=0;
    int high=n-1;
    while(low<=high){
        int mid = (low+high)/2;
        if (arr[mid]>x){
            high=mid-1;
        }
        else if(arr[mid]<x){
            low=mid+1;
        }
        else{
            if(arr[mid]==x && arr[mid] != arr[mid-1]){
                return mid;
            }
            else{
                high=mid-1;
            }
        }
    }
    return -1;
    
}