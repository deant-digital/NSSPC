#include <bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin >> n;
    vector<bool> is_prime(n + 1, true);
    int largest_prime = 2;
    for (int i = 2; i <= n; ++i) {
        if (!is_prime[i]) continue;
        largest_prime = i;
        for (int j = i * i; j <= n; j += i)
            is_prime[j] = false;
    }
    cout << largest_prime;
}
