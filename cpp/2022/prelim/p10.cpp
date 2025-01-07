#include <bits/stdc++.h>

using namespace std;

int main() {
    string str;
    getline(cin, str);
    bool bl;
    do {
        bl = false;
        for (int i = 1; i < str.length(); ++i) {
            if (str[i - 1] == str[i]) {
                str.erase(i - 1, 2);
                bl = true;
                break;
            }
        }
    } while (bl);
    if (str.length()) cout << str;
    else cout << "Empty String";
}
