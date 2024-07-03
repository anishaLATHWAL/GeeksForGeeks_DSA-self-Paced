// This commit includes only the countOnes function. 
// The rest of the implementation and context are present in the 
// GeeksforGeeks (GFG) code editor.

long long int floorSqrt(long long int x) 
    {
        // Your code goes here   
        long long int low = 1;
        long long int high = x;
        long long int ans=-1;
        while(low<=high){
            long long int mid = (low+high)/2;
            long long int midsquare = mid*mid;
            if(midsquare == x){
                return mid;
            }
            else if(midsquare>x){
                high = mid-1;
            }
            else{
                low=mid+1;
                ans=mid;
            }
        }
        return ans;
    }