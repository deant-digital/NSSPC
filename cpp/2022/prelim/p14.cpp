#include <bits/stdc++.h>

using namespace std;

int main() {
    int r, c;
    cin >> r >> c;
    vector dp(r, vector<int>(c));
    int largest_square = 1;
    for (int i = 0; i < r; ++i) {
        for (int j = 0; j < c; ++j) {
            int value;
            cin >> value;
            if (value == 0) dp[i][j] = 0;
            else if (i == 0 || j == 0) dp[i][j] = 1;
            else dp[i][j] = min(dp[i - 1][j], dp[i][j - 1]) + 1;
            if (dp[i][j] > largest_square) largest_square = dp[i][j];
        }
    }
    if (largest_square == 1) cout << "No Square";
    else cout << largest_square;
}
