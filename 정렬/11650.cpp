//20/1/16 05:52 11650
#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;
int main() {
	cin.tie(NULL);
	ios_base::sync_with_stdio(false);
	vector<pair<int, int>> vecp;
	int n;
	cin >> n;
	for (int i = 0; i < n; i++) {
		pair<int, int> temp;
		cin >> temp.first >> temp.second;
		vecp.push_back(temp);
	}
	sort(vecp.begin(), vecp.end());
	for (pair<int, int> &temp : vecp) {
		cout << temp.first << ' ' << temp.second << "\n";
	}
}
