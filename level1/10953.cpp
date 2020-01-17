//20/1/18 12:44 10953
#include <iostream>
#include <algorithm>
#include <string>

using namespace std;
int main() {
	string a, b;
	cin >> a >> b;
	reverse(a.begin(), a.end());
	reverse(b.begin(), b.end());
	if (a.length() > b.length())
		swap(a, b);
	for (string::iterator it = a.begin(); it < a.end(); it++) {

	}
}