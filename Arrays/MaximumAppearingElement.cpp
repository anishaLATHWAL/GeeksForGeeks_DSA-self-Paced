#include <iostream>
using namespace std;
int maxAppear(int left[], int right[],int n){
    int freq[101]={0};
    for(int i=0;i<n;i++){
        freq[left[i]]++;
        freq[right[i]+1]--;
    }
    int res=0;
    for(int i=1;i<n;i++){
        freq[i]= freq[i]+freq[i-1];
        if(freq[i]>freq[i-1]){
            res=i;
        }
    }
    return res;
}
int main()
{
	int L[] = { 1, 4, 9, 13, 21 };
	int R[] = { 15, 8, 12, 20, 30 };
	int n = sizeof(L) / sizeof(L[0]);

	cout << maxAppear(L, R, n) << endl;
	return 0;
}