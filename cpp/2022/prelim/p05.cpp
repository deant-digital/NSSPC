#include <bits/stdc++.h>

using namespace std;

int main() {
    string str;
    getline(cin, str);
    if (str.length() > 100) {
        cout << "Invalid Length";
        return 0;
    }
    int sum = 0;
    for (const char &c: str) {
        if (const int value = tolower(c) - 'a' + 1;
            value == 2 || value == 3 || value == 5 || value == 7 || value == 11
            || value == 13 || value == 17 || value == 19 || value == 23)
            sum += value;
    }
    cout << sum;
}
