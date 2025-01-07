#include <bits/stdc++.h>

using namespace std;

int main() {
    int n;
    char c;
    cin >> n >> c;
    for (int i = 0; i < n; ++i)
        cout << string(n - i - 1, ' ') << string(2 * i + 1, c) << endl;
    for (int i = 0; i < n; ++i)
        cout << string(n - 1, ' ') << c << endl;
}
