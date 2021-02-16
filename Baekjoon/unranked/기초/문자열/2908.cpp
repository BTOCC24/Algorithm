//20/1/1 11:33 2908
#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

int main()
{
	string input1,input2;
	cin >> input1>>input2;
	reverse(input1.begin(), input1.end());
	reverse(input2.begin(), input2.end());
	int num1 = atoi(input1.c_str());
	int num2 = atoi(input2.c_str());
	(num1 > num2) ? cout << num1 : cout << num2;

}
