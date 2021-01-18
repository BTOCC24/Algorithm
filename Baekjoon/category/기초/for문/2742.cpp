//20/1/1 05:13 2742
#include <iostream>
using namespace std;


int main() {
	int N;
	cin.tie(NULL);
	ios_base::sync_with_stdio(false);
	cin >> N;
	for (int i = 1; i <= N; i++)
		cout << N - i + 1 << "\n";
	return 0;
}