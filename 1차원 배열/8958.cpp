//20/1/1 09:24 8958
#include <iostream>
#include <string>
using namespace std;
int main()
{
	int T;
	cin >> T;
	string input;
	for (int i = 0; i < T; i++) {
		cin >> input;
		int grade = 0, incre = 1;
		for (unsigned int j = 0; j < input.length(); j++) {
			if (input[j] == 'X') {
				incre = 1;
			}
			else {
				grade += incre;
				incre++;
			}
		}
		cout << grade << endl;
	}
	return 0;
}
