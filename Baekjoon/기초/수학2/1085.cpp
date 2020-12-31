//20/1/7 1085 17:06
#include <iostream>
using namespace std;

int main()
{
	unsigned int x, y, w, h;
	unsigned int min;
	cin >> x >> y >> w >> h;
	min = x;
	if (y < min)
		min = y;
	if (w - x < min)
		min = w - x;
	if (h - y < min)
		min = h - y;
	cout << min;
}