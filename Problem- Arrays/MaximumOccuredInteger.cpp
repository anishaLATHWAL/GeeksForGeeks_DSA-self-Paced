// This commit includes only the maxOccured function. 
// The rest of the implementation and context are present in the 
// GeeksforGeeks (GFG) code editor.

int maxOccured(int n, int l[], int r[], int maxx) {

        // Your code here
        int freq[100000] = {0};
        for(int i=0;i<n;i++){
            freq[l[i]]++;
            freq[r[i]+1]--;
        }
        int res=0;
        for(int i=0;i<100000;i++){
            freq[i] = freq[i]+freq[i-1];
            if(freq[i]>freq[res]){
                res=i;
            }
        }
        return res;
    }