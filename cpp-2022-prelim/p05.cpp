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
        if (const int v = tolower(c) - 'a' + 1;
            v == 2 || v == 3 || v == 5 || v == 7 || v == 11 || v == 13 || v == 17 || v == 19 || v == 23)
            sum += v;
    }
    cout << sum;
}
