//20/1/22 23:00 10757

#include <iostream>
#include <algorithm>
#include <string>

using namespace std;

void add(string &dest, int index, char value) {
	dest[index] = dest[index] + (value - '0');
	if (dest[index] > '9') {
		dest[index] -= 10;
		add(dest, index + 1, '1');
	}
}

int main() {
	string a, b;
	cin >> a >> b;
	if (a.length() > b.length() || (a.length() == b.length() && a.compare(b) == 1)) {
		swap(a, b);
	}
	reverse(a.begin(), a.end());
	reverse(b.begin(), b.end());
	b += '0';
	for (unsigned int i = 0; i < a.length(); i++)
		add(b, i, a[i]);
	reverse(b.begin(), b.end());
	while (b.length() > 1 && b[0] == '0') {
		b = b.substr(1, b.length() - 1);
	}
	if (b[0] == '0') {
		cout << '0';
		return 0;
	}
	cout << b << endl;
}