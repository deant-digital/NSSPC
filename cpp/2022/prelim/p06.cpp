#include <bits/stdc++.h>

using namespace std;

int main() {
    double m, c;
    cin >> m >> c;
    const double delta = (m + 2) * (m + 2) + 4 * (c + 3);
    if (delta < 0) {
        cout << "No intersection";
        return 0;
    }
    cout << fixed << setprecision(7);
    const double center = m / 2 + 1;
    if (delta == 0) {
        cout << "One intersection" << endl;
        cout << center << ", " << m * center + c;
        return 0;
    }
    cout << "Two intersections" << endl;
    const double difference = sqrt(delta) / 2;
    const double x1 = center + difference;
    const double x2 = center - difference;
    cout << x1 << ", " << m * x1 + c << endl;
    cout << x2 << ", " << m * x2 + c;
}
