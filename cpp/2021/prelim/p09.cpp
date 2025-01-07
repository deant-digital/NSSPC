#include <bits/stdc++.h>

using namespace std;

int gcd(const int x, const int y) {
    return x == 0 ? y : gcd(y % x, x);
}

int lcm(const int x, const int y) {
    return x / gcd(x, y) * y;
}

int main() {
    int x, y, z;
    cin >> x >> y >> z;
    cout << lcm(x, lcm(y, z));
}
