//20/1/1 05:21 2439
#include <iostream>
using namespace std;


int main() {
	int N;
	cin.tie(NULL);
	ios_base::sync_with_stdio(false);
	cin >> N;
	for (int i = 1; i <= N; i++) {
		for (int j = 1; j <= N - i; j++)
			cout << " ";
		for (int j = 1; j <= i; j++)
			cout << '*';
		cout << "\n";
	}
	return 0;
}