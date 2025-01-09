#include <bits/stdc++.h>

using namespace std;

int main() {
    double weight, height;
    cin >> weight >> height;
    const double bmi = weight / height / height;
    cout << fixed << setprecision(2) << bmi << endl;
    if (bmi < 20) cout << "Underweight";
    else if (bmi < 25) cout << "Healthy Weight";
    else if (bmi < 30) cout << "Overweight";
    else cout << "Obesity";
}
