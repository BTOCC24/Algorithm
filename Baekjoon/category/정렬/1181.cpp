//20/1/16 06:16 1181
#include <iostream>
#include <algorithm>
#include <vector>
#include <string>

using namespace std;

bool compare(string a,string b) {
	if (a.length() == b.length())
		return a < b;
	else
		return a.length() < b.length();
}

int main() {
	vector<string> strv;
	int n;
	cin >> n;
	for (int i = 0; i < n; i++) {
		string temp;
		cin >> temp;
		strv.push_back(temp);
	}
	sort(strv.begin(), strv.end(), compare);
	strv.erase(unique(strv.begin(), strv.end()), strv.end());
	for (string &temp : strv) {
		cout << temp << "\n";
	}
}
