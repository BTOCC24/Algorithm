//20/1/16 19:20 10814
#include <iostream>
#include <algorithm>
#include <vector>
#include <string>

using namespace std;

bool cmp(pair<int, string> u, pair<int, string> v)
{
	return u.first < v.first;
}

int main() {
	cin.tie(NULL);
	ios_base::sync_with_stdio(false);
	vector<pair<int, string>> info;
	int n;
	cin >> n;
	for (int i = 0; i < n; i++) {
		pair<int, string> temp;
		cin >> temp.first;
		cin >> temp.second;
		info.push_back(temp);
	}
	stable_sort(info.begin(), info.end(), cmp);
	for (pair<int, string> &temp : info) {
		cout << temp.first << ' ' << temp.second << "\n";
	}
}