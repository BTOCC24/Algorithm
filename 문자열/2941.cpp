//20/1/1 08:15 2941
#include <iostream>
#include <string>
using namespace std;

int main()
{
	int len;
	string str;
	cin >> str;
	len = str.length();
	for (int i = 0; i < str.length(); i++) {
		if (str[i] == '=' || str[i] == '-')
			len--;
		if (str[i] == 'l' && i <= str.length() - 2 && str[i + 1] == 'j')
			len--;
		if (str[i] == 'n' && i <= str.length() - 2 && str[i + 1] == 'j')
			len--;
		if (str[i] == 'd' && i <= str.length() - 3 && str[i + 1] == 'z'&& str[i + 2] == '=')
			len--;
	}
	cout << len;
}
