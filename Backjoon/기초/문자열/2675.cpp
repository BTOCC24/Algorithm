//20/1/1 11:14 2675
#include <iostream>
#include <string>
using namespace std;

int main()
{
	int T;
	cin >> T;
	for (int i = 0; i < T; i++) {
		int n;
		string input;
		cin >> n >> input;
		for (int j = 0; j < input.length(); j++) {
			for (int k = 0; k < n; k++) {
				cout << input[j];
			}
		}
		cout << endl;
	}
}
