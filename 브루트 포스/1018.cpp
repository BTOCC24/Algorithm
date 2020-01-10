//20/1/10 03:20 1018
#include <iostream>
#include <string>
using namespace std;
int main() {
	char chess[50][50];
	int n, m;
	int min = 5000, wcnt = 0, bcnt = 0;
	cin >> n >> m;
	for (int i = 0; i < n; i++)
		cin >> chess[i];
	for (int i = 0; i <= n - 8; i++) {
		for (int j = 0; j <= m - 8; j++) {
			for (int k = 0; k < 8; k++) {
				for (int l = 0; l < 8; l++) {
					if ((k + l) % 2) {
						if (chess[i + k][j + l] == 'W')
							wcnt++;
						else
							bcnt++;
					}
					else {
						if (chess[i + k][j + l] == 'B')
							wcnt++;
						else
							bcnt++;
					}
				}
			}
			if (min > wcnt)min = wcnt;
			if (min > bcnt)min = bcnt;
			wcnt = 0;
			bcnt = 0;
		}
	}
	cout << min;
}