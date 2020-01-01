//20/1/1 05:17 11022
#include <iostream>
using namespace std;


int main() {
	int N, a, b;
	cin.tie(NULL);
	ios_base::sync_with_stdio(false);
	cin >> N;
	for (int i = 1; i <= N; i++) {
		cin >> a >> b;
		cout << "Case #" << i << ": " << a<<" + "<<b<<" = "<<a + b << "\n";
	}
	return 0;
}