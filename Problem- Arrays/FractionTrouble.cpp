// This commit includes only the LargestFraction function. 
// The rest of the implementation and context are present in the 
// GeeksforGeeks (GFG) code editor.

vector<int>LargestFraction(int n, int d){
	    // Code here
	    int num=0,deno=1;
	    for(int q=10000;q>=2;q--){
	        int p= (n*q-1)/d;
	        if(p*deno>=q*num){
	            deno=q;
	            num=p;
	        }
	    }
	    int g= __gcd(num,deno);
	    
	    vector<int>ans;
	    ans.push_back(num/g);
	    ans.push_back(deno/g);
	    return ans;
	}