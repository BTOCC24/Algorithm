class Solution {
	public String solution(int n) {
		String answer = "";
		int count = n / 2;
		for (int i = 0; i < count; i++) {
			answer += "¼ö¹Ú";
		}
		if (n % 2 == 0)
			return answer;
		else
			return answer + "¼ö";
	}
}