//20/1/2 21:52 10250
#include <iostream>
#include <string>
using namespace std;

int main()
{
	int T;
	cin >> T;
	for (int i = 1; i <= T; i++) {
		int H, W, N;
		cin >> H >> W >> N;
		if (N%H) 
			printf("%d%02d\n", N%H, N / H + 1);
		else
			printf("%d%02d\n", H, N / H);
	}
}
