#include <iostream>
#include <string>
using namespace std;
int main() {
	char board[50][50];
	int n, m;
	int min = 64, wcnt = 0, bcnt = 0;
	cin >> n >> m;
	for (int i = 0; i < n; i++)
		cin >> chess[i];
	for (int i = 0; i < n - 7; i++) {
		for (int j = 0; j < m - 7; j++) {
		    int w = 0, b = 0
			for (int k = 0; k < 8; k++) {
				for (int l = 0; l < 8; l++) {
					if ((k + l) % 2) {
						if (chess[i + k][j + l] == 'W')
							w++;
						else
							b++;
					}
					else {
						if (chess[i + k][j + l] == 'B')
							w++;
						else
							b++;
					}
				}
			}
			if (min > w)min = w;
			if (min > b)min = b;
		}
	}
	cout << min;
}