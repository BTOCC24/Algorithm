//20/1/1 11:18 1157
#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

int main()
{
	int alpa[26], max = 0, cnt = 0, index = 0;
	string input;
	fill_n(alpa, 26, 0);
	cin >> input;
	transform(input.begin(), input.end(), input.begin(), ::toupper);
	for (int i = 0; i < input.length(); i++) {
		alpa[input[i]-'A']++;
	}
	for (int i = 0; i < 26; i++) {
		if (alpa[i] > max) {
			max = alpa[i];
		}
	}
	for (int i = 0; i < 26; i++) {
		if (max == alpa[i]) {
			cnt++;
			index = i;
		}
	}
	if (cnt == 1) {
		cout << (char)(index + 'A');
	}
	else
		cout << "?";
}
