#include <bits/stdc++.h>

using namespace std;

int main() {
    int x, p;
    cin >> x >> p;
    const int n = (1 << x) - 1;
    vector<int> vec(n);
    int idx = -1;
    for (int i = 0; i < n; ++i) {
        int value;
        cin >> value;
        vec[i] = value;
        if (value == p) idx = i;
    }
    const int i = idx * 2 + 1;
    const int j = i + 1;
    if (i >= n || vec[i] == -1) cout << "NULL";
    else cout << vec[i];
    cout << " ";
    if (j >= n || vec[j] == -1) cout << "NULL";
    else cout << vec[j];
}
