//20/1/1 08:21 1316
#include <iostream>
#include <string>
using namespace std;

int main()
{
	int N, cnt=0;
	string input;
	cin >> N;
	for (int i = 0; i < N; i++) {
		cin >> input;
		int alpa[26] = { 0, };
		int iter = 1;
		char imsi = input[0];
		alpa[imsi - 'a']++;
		for (iter = 1; iter < input.length(); iter++) {
			if (imsi != input[iter]) {
				imsi = input[iter];
				if (alpa[imsi - 'a']==1) {
					break;
				}
				alpa[imsi - 'a']++;
			}
		}
		if (iter == input.length())
			cnt++;
	}
	cout << cnt;
}
