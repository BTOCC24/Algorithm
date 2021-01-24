//20/1/18 23:24 15740
#include <iostream>
#include <algorithm>
#include <string>

using namespace std;

void add(string &dest, int index, char value) {
	dest[index] = dest[index] + (value - '0');
	if (dest[index] > '9') {
		dest[index] -= 10;
		add(dest, index + 1, '1');
	}
}

void sub(string &dest, int index, char value) {
	dest[index] = dest[index] - (value - '0');
	if (dest[index] < '0') {
		dest[index] += 10;
		sub(dest, index + 1, '1');
	}
}

int main() {
	bool sign_a = true, sign_b = true;
	string a, b;
	cin >> a >> b;
	if (a[0] == '-') { //����üũ
		a = a.substr(1, a.length() - 1);
		sign_a = false;
	}
	if (b[0] == '-') { //����üũ
		b = b.substr(1, b.length() - 1);
		sign_b = false;
	}
	if (a.length() > b.length() || (a.length() == b.length() && a.compare(b) == 1)) { //swap if abs(b) > abs(a)
		swap(a, b);
		swap(sign_a, sign_b);
	}
	reverse(a.begin(), a.end()); // reverse to easily compute
	reverse(b.begin(), b.end());
	if (sign_a == sign_b) {
		b += '0';
		for (unsigned int i = 0; i < a.length(); i++)
			add(b, i, a[i]);
	}
	else {
		for (unsigned int i = 0; i < a.length(); i++)
			sub(b, i, a[i]);
	}
	reverse(b.begin(), b.end()); //re-reverse to print correct answer
	while (b.length() > 1 && b[0] == '0') { //�տ� �ִ� 0����
		b = b.substr(1, b.length() - 1);
	}
	if (b[0] == '0') { //���̰� 1�̰� ��Ұ� 0�̸� 0����ϰ� ����
		cout << '0';
		return 0;
	}
	if (!sign_b) cout << '-'; //����ū�� ������ -����
	cout << b.size() << ' ' << b << endl;
}