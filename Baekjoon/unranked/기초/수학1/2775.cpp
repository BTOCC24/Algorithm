//20/1/2 23:20 2775
#include <iostream>
#include <string>
using namespace std;

int main()
{
	int T, k, n;
	int arr[15][15];
	for (int i = 0; i < 15; i++) {
		arr[0][i] = i;
		arr[i][1] = 1;
	}
	for (int i = 2; i < 15; i++) {
		for (int j = 1; j < 15; j++) {
			arr[j][i] = arr[j][i - 1] + arr[j - 1][i];
		}
	}
	cin >> T;
	for (int i = 0; i < T; i++) {
		cin >> k >> n;
		cout << arr[k][n] << endl;
	}
}

// 1 5 15 35 70
// 1 4 10 20 35
// 1 3 6 10 15
// 1 2 3 4 5 0Ãþ