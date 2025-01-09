#include <bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin >> n;
    cout << fixed << setprecision(7);
    for (int i = 0; i < n; ++i) {
        double temperature;
        cin >> temperature;
        cout << (temperature + 273.15) / (99 + 273.15) * 2800 << endl;
    }
}
