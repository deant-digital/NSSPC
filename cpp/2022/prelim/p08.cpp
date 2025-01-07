#include <bits/stdc++.h>

using namespace std;

int main() {
    double dx, dy, w, v;
    cin >> dx >> dy >> w >> v;
    cout << fixed << setprecision(2) << (w - dy * v) / (dx - dy) * 100 / v << " "
            << (w - dx * v) / (dy - dx) * 100 / v;
}
