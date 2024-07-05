// This commit includes only the bubbleSort function. 
// The rest of the implementation and context are present in the 
// GeeksforGeeks (GFG) code editor.

void bubbleSort(int arr[], int n) {
        // Your code here
        for(int i=0;i<n-1;i++){
            bool swapped = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr[j],arr[j+1]);
                    swapped = true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }