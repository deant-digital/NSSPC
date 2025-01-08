#include <bits/stdc++.h>

using namespace std;

int main() {
    double dx, dy, w, v;
    cin >> dx >> dy >> w >> v;
    if (v * min(dx, dy) > w || v * max(dx, dy) < w) {
        cout << "Invalid Input";
        return 0;
    }
    cout << fixed << setprecision(2) << (w - dy * v) / (dx - dy) * 100 / v << " "
            << (w - dx * v) / (dy - dx) * 100 / v;
}
