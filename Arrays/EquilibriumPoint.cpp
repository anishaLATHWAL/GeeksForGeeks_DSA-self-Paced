
#include <bits/stdc++.h>
using namespace std;

int equilibrium(int arr[], int n) {
    int sum = 0; 
    int leftsum = 0; 

    for (int i = 0; i < n; ++i)
        sum += arr[i];

    for (int i = 0; i < n; ++i) {
        sum -= arr[i]; 

        if (leftsum == sum)
            return i;

        leftsum += arr[i];
    }

    return -1;
}

int main() {
    int arr[] = {1, 3, 5, 2, 2};
    int n = 5;
    int eq_index = equilibrium(arr, n);

    if (eq_index != -1) {
        cout << "Equilibrium index is " << eq_index << endl;
    } else {
        cout << "No equilibrium index found" << endl;
    }

    return 0;
}
