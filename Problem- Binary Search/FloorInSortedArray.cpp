// This commit includes only the findFloor function. 
// The rest of the implementation and context are present in the 
// GeeksforGeeks (GFG) code editor.

int findFloor(vector<long long> v, long long n, long long x) {

        // Your code here
        int low=0, high= v.size()-1;
        int result = -1;
        while(low<=high){
            int mid= (low+high)/2;
            if(v[mid] <= x){
                result = mid;
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return result;
    }