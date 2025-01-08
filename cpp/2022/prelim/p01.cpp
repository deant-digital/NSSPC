#include <bits/stdc++.h>

using namespace std;

int read_int() {
    string str;
    cin >> str;
    try {
        if (const int value = stoi(str); abs(value - stod(str)) < 1e-9) return value;
    } catch (exception _) {
    }
    return INT_MAX;
}

int main() {
    int x = read_int();
    int y = read_int();
    if (x > y) swap(x, y);
    if (x < 0 || y == INT_MAX) {
        cout << "Invalid Input";
        return 0;
    }
    x = (x + 1) / 2 * 2;
    y = y / 2 * 2;
    cout << ((y - x) / 2 + 1) * (x + y) / 2;
}
