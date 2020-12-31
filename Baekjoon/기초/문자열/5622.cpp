//20/1/1 12:41 5622
#include <iostream>
#include <string>
using namespace std;

int main()
{
	char arr[] = { 'C','F','I','L','O','S','V','Z' };
	string input;
	int time;
	cin >> input;
	time = input.length() * 2;
	for (unsigned int i = 0; i < input.length(); i++) {
		for (int j = 0; j < 8; j++) {
			if (input[i] <= arr[j]) {
				time += (j + 1);
				break;
			}
		}
	}
	cout << time;
}
