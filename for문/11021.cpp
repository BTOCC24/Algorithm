//20/1/1 05:14 11021
#include <iostream>
using namespace std;


int main() {
	int N, a, b;
	cin.tie(NULL);
	ios_base::sync_with_stdio(false);
	cin >> N;
	for (int i = 1; i <= N; i++) {
		cin >> a >> b;
		cout << "Case #" << i << ": " << a + b << "\n";
	}
	return 0;
}