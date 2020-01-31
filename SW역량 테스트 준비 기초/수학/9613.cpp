//20/1/20 23:00 9613

#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int findgcd(int n, int m) {
	if (n > m)
		swap(n, m);
	int i = 0;
	for (i = n; i > 0; i--) {
		if (m%i == 0 && n%i == 0)
			return i;
	}
	return i;
}
int main() {
	cin.tie(NULL);
	int T;
	cin >> T;
	while (T--) {
		int num;
		long long sum = 0;
		cin >> num;
		vector<int> input(num);
		for (unsigned int i = 0; i < input.size(); i++)
			cin >> input[i];
		if (num == 1) {
			cout << input[0] << endl;
			continue;
		}
		for (unsigned int i = 0; i < input.size() - 1; i++) {
			for (unsigned int j = i + 1; j < input.size(); j++) {
				sum += findgcd(input[i], input[j]);
			}
		}
		cout << sum << endl;
	}
}