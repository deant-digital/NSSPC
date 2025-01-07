#include <bits/stdc++.h>

using namespace std;

int main() {
    int x, y;
    cin >> x >> y;
    if (y % 2 || x * 4 < y || x * 2 > y) {
        cout << "No feasible solution";
        return 0;
    }
    cout << x * 2 - y / 2 << endl;
    cout << y / 2 - x;
}
