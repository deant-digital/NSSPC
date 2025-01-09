#include <bits/stdc++.h>

using namespace std;

int main() {
    double p, r, t;
    cin >> p >> r >> t;
    cout << static_cast<int>(ceil((log(t) - log(p)) / log(1 + r)));
}
