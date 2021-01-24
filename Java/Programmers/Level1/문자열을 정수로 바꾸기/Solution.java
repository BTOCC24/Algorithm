class Solution {
    public int solution(String s){
        boolean sign = false;
        char first = s.charAt(0);
        if(first == '+' || first == '-'){
            s = s.substring(1);
            if(first == '-'){
                sign = true;
            }
        }
        int answer = 0;
        for(int i=0;i<s.length();i++){
            answer *= 10;
            answer += s.charAt(i) - '0';
        }
        if(sign)
            answer *= -1;
        return answer;
    }
}