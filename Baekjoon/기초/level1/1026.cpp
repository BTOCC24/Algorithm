//20/02/02 09:00 1026
#include <iostream>
#include <vector>
#include <algorithm>
#include <utility>

using namespace std;
int main() {
	int n, val, result = 0;
	cin >> n;
	vector<int> mul, src;
	for (int i = 0; i < n; i++) {
		cin >> val;
		mul.push_back(val);
	}
	for (int i = 0; i < n; i++) {
		cin >> val;
		src.push_back(val);
	}
	sort(mul.begin(), mul.end());
	while (src.size()) {
		int i, max = 0;
		for (i = 0; i < (int)src.size(); i++) {
			if (src[i] > src[max])
				max = i;
		}
		result += (mul[0] * src[max]);
		mul.erase(mul.begin());
		src.erase(src.begin() + max);
	}
	cout << result << endl;
}