//20/1/12 22:20 2751
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int main() {
	cin.tie(NULL);
	ios_base::sync_with_stdio(false);
	int n;
	vector<int> v;
	cin >> n;
	for (int i = 0; i < n; i++) {
		int p;
		cin >> p;
		v.push_back(p);
	}
	make_heap(v.begin(), v.end());
	sort_heap(v.begin(), v.end());
	for (int &x : v) {
		cout << x << "\n";
	}
}