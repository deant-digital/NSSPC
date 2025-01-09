#include <bits/stdc++.h>

using namespace std;

int main() {
    string str;
    getline(cin, str);
    if (str.length() > 25) {
        cout << "Invalid Length";
        return 0;
    }
    stringstream ss;
    unordered_set<string> set;
    vector<string> vec;
    for (const char &c: str) {
        if ((!isalpha(c) || isupper(c)) && !ss.str().empty()) {
            if (!set.count(ss.str())) {
                set.insert(ss.str());
                vec.push_back(ss.str());
            }
            ss.str("");
        }
        if (isalpha(c)) ss << c;
    }
    if (!ss.str().empty() && !set.count(ss.str())) vec.push_back(ss.str());
    for (int i = 0; i < vec.size(); ++i) {
        if (i) cout << " ";
        cout << vec[i];
    }
    cout << endl << vec.size();
}
