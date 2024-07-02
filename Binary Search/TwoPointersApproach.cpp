#include <iostream>
using namespace std;

bool isPair(int arr[], int n, int x) {
    int i = 0, j = n - 1; 
    while (i < j) {
        if (arr[i] + arr[j] == x) 
            return true; 
        else if (arr[i] + arr[j] < x) 
            i++;
        else 
            j--;
    }
    return false;
}

int main() {
    int arr[] = {1, 2, 4, 5, 7, 11, 15};
    int n = sizeof(arr) / sizeof(arr[0]);
    int x = 9;

    if (isPair(arr, n, x))
        cout << "Yes, there is a pair with sum " << x << endl;
    else
        cout << "No, there isn't a pair with sum " << x << endl;

    return 0;
}
