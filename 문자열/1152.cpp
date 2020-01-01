//20/1/1 11:53 1152
#include <iostream>
#include <string>
using namespace std;

int main()
{
	string input;
	int cntblank = 0;
	getline(cin, input);
	for (unsigned int i = 0; i < input.length(); i++) {
		if (input[i] == ' ')
			cntblank++;
	}
	if (input[0] == ' ')
		cntblank--;
	if (input[input.length()-1] == ' ')
		cntblank--;

	cout << ++cntblank;
}
