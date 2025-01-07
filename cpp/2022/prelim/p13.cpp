#include <bits/stdc++.h>

using namespace std;

int main() {
    int x, n;
    cin >> x >> n;
    unordered_map<int, int> map;
    int count = 0;
    for (int i = 0; i < n; ++i) {
        int value;
        cin >> value;
        if (value < -100 || value > 100) continue;
        count += map[x - value];
        ++map[value];
    }
    cout << count;
}
