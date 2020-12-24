//20/1/16 06:02 11651
#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

bool compare(pair<int, int> a, pair<int, int> b) {
	if (a.second == b.second)
		return b.first > a.first;
	else
		return b.second > a.second;
}
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
	sort(vecp.begin(), vecp.end(), compare);
	for (pair<int, int> &temp : vecp) {
		cout << temp.first << ' ' << temp.second << "\n";
	}
}
