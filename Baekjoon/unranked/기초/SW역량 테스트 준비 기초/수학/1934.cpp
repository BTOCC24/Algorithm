//20/1/19 23:00 1934

#include <iostream>
#include <algorithm>
using namespace std;

int main() {
	cin.tie(NULL);
	int T;
	cin >> T;
	while (T--) {
		int n, m;
		cin >> n >> m;
		if (n > m)
			swap(n, m);
		for (int temp = m, i = 1;; ++i) {
			temp = m*i;
			if (temp%n == 0) {
				cout << temp << '\n';
				break;
			}
		}
	}
}