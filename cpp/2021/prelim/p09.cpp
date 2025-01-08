#include <bits/stdc++.h>

using namespace std;

int gcd(int x, int y) {
    while (x != 0) {
        y %= x;
        swap(x, y);
    }
    return y;
}

int lcm(const int x, const int y) {
    return x / gcd(x, y) * y;
}

int main() {
    int x, y, z;
    cin >> x >> y >> z;
    cout << lcm(x, lcm(y, z));
}
