#include <bits/stdc++.h>

using namespace std;

int main() {
    string str;
    getline(cin, str);
    int count = 0;
    for (const char &c: str)
        if (const char lower = static_cast<char>(tolower(c));
            lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u')
            ++count;
    cout << count;
}
