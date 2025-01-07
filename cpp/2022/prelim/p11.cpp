#include <bits/stdc++.h>

using namespace std;

int main() {
    string str;
    cin >> str;
    int value = stoi(to_string(str[1]) + str[3] + str[2] + str[0]);
    for (int i = 0; i < 2; ++i) {
        value *= value;
        value %= 1'000'000;
    }
    cout << value;
}
