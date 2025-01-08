#include <bits/stdc++.h>

using namespace std;

int main() {
    int x;
    cin >> x;
    unordered_map<int, int> map;
    int count = 0, nums = 0;
    while (nums < 20) {
        int value;
        cin >> value;
        if (value < -100 || value > 100) continue;
        count += map[x - value];
        ++map[value];
        ++nums;
    }
    cout << count;
}
