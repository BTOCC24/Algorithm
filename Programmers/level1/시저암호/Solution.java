class Solution {
    public String solution(String s, int n) {
        String answer = "";
        // System.out.print('a' > 'A'); ÀÌ°Ô true
        char arr[] = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if (arr[i] == ' '){
                continue;
            }
            if (arr[i] >= 'a'){
                arr[i] = (char)('a' + (arr[i] - 'a' + n) % 26);
            }else{
                arr[i] = (char)('A' + (arr[i] - 'A' + n) % 26);
            }
        }
        answer = new String(arr);
        return answer;
    }
}