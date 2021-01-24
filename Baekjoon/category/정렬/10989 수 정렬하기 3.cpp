#include <iostream>
using namespace std;
int main() {
	cin.tie(NULL);
	ios_base::sync_with_stdio(false);
	int n = 0, i, j;
	int num[10001] = { 0, };
	cin >> n;
	for (i = 0; i < n; i++) {
		int input;
		cin >> input;
		num[input]++;
	}

	for (i = 1; i <= 10000; i++) {
		for (j = 1; j <= num[i]; j++) {
			cout << i << "\n";
		}
	}
}