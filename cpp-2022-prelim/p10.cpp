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
                int j = i + 1;
                while (j < str.length() && str[j] == str[i]) ++j;
                str.erase(i - 1, j - i + 1);
                bl = true;
                break;
            }
        }
    } while (bl);
    if (!str.empty()) cout << str;
    else cout << "Empty String";
}
