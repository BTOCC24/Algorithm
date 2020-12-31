#include <iostream>
using namespace std;

int main() {
    unsigned int n;
    int body[2][50];
    cin >> n;
    for (int i = 0; i < n; i++)
        cin >> body[0][i] >> body[1][i];
    for (int i = 0; i < n; i++) {
        int rank = 1;
        for (int j = 0; j < n; j++) {
            if (body[0][j] > body[0][i] && body[1][j] > body[1][i])
                rank++;
        }
        cout << rank;
    }
    return 0;
}