#include <bits/stdc++.h>

using namespace std;

int main() {
    double value;
    char c;
    cin >> value >> c;
    cout << fixed << setprecision(1);
    if (c == 'C') cout << value * 9 / 5 + 32 << "F";
    else cout << (value - 32) * 5 / 9 << "C";
}
