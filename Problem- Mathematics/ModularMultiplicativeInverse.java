
// Further Code <>

class Solution
{
    
  public int modInverse(int a, int m)
    {
      //Your code here
      for(int i=1; i < m; i++) {
            if( ((a%m) * (i%m))%m == 1 ) return i;
        }
        return -1;
    }

}

// (a * x)≡1 (mod m)
// (a * x) % m = 1 
