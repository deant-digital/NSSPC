#include <bits/stdc++.h>

using namespace std;

int main() {
    vector<int> vec(7);
    for (int &i: vec) cin >> i;
    sort(vec.begin(), vec.end());
    cout << fixed << setprecision(2) << (vec[2] + vec[3] + vec[4]) / 3.0;
}
