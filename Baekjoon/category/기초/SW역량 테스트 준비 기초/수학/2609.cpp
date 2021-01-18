//20/1/17 23:00 2609

#include <iostream>
using namespace std;

int main() {
	int n, m;
	cin >> n >> m;
	if (n > m) {
		int k = n;
		n = m;
		m = k;
	}
	for (int i = n; i > 0; i--) {
		if (m%i == 0 && n%i == 0) {
			cout << i << endl;
			break;
		}
	}
	for (int temp = m, i = 1;; temp = m * ++i) {
		if (temp%n == 0) {
			cout << temp << endl;
			break;
		}
	}
}