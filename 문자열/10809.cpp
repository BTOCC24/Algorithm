//20/1/1 11:08 10809
#include <iostream>
#include <string>
using namespace std;

int main()
{
	int alpa[26];
	fill_n(alpa, 26, -1);
	string input;
	cin >> input;
	for (unsigned int i = 0; i < input.length(); i++) {
		if (alpa[input[i] - 'a'] == -1)
			alpa[input[i] - 'a'] = i;
	}
	for (unsigned int i=0;i<26;i++)
		cout << alpa[i]<<' ';
}
