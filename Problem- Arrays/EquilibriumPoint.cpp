// This commit includes only the equilibriumPoint  function. 
// The rest of the implementation and context are present in the 
// GeeksforGeeks (GFG) code editor.

int equilibriumPoint(long long arr[], int n) {

        // Your code here
        long long rs=0;
        for (int i=0;i<n;i++){
            rs+=arr[i];
            
        }
        long long ls=0;
        for(int i=0;i<n;i++){
            rs-=arr[i];
            if(ls==rs){
                return i+1;
            }
            ls+=arr[i];
        }
        return -1;
        
    }
