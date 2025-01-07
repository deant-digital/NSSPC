#include <bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin >> n;
    int sum = 0;
    for (int i = 1; i * i <= n; ++i) {
        if (n % i) continue;
        sum += i + n / i;
        if (i * i == n) sum -= i;
    }
    cout << sum;
}
