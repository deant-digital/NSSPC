#include <bits/stdc++.h>

using namespace std;

int main() {
    int a, n;
    cin >> a >> n;
    for (int i = 0; i < n; ++i)
        a = a * 5 + 7;
    cout << a;
}
