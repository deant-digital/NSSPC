#include <bits/stdc++.h>

using namespace std;

int main() {
    double x, y, z;
    cin >> x >> y >> z;
    if (x > y) swap(x, y);
    if (y > z) swap(y, z);
    if (x > y) swap(x, y);
    if (x + y <= z) {
        cout << "Invalid";
        return 0;
    }
    if (x == z) cout << "Equilateral Triangle";
    else if (x == y || y == z) cout << "Isosceles Triangle";
    else cout << "Scalene Triangle";
    const double s = (x + y + z) / 2;
    cout << static_cast<int>(round(sqrt(s * (s - x) * (s - y) * (s - z))));
}
