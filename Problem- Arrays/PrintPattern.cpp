// This commit includes only the pattern function. 
// The rest of the implementation and context are present in the 
// GeeksforGeeks (GFG) code editor.

vector<int> pattern(int N){
        // code here
        int x=N;
        vector<int> ans;
        ans.push_back(N);
        while(N>0){
            N-=5;
            ans.push_back(N);
        }
        while(x!=N){
            N+=5;
            ans.push_back(N);
        }
        return ans;
    }