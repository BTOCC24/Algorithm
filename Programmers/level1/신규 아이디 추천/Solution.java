class Solution {
    public String solution(String new_id) {
        String answer = "";
        String temp = new_id.toLowerCase();
        for (int i=0;i<temp.length();i++){
            char c = temp.charAt(i);
            if ('a' <= c && c <= 'z' || '0' <= c && c <= '9' || c == '-' || c == '_' || c =='.')
                answer += c;
        }
        while(answer.indexOf("..") >= 0){
            answer = answer.replace("..", ".");
        }
        if (answer.length() > 0 && answer.charAt(0) == '.')
            answer = answer.substring(1);
        if (answer.length() > 0 && answer.charAt(answer.length()-1) == '.')
            answer = answer.substring(0, answer.length()-1);
        if (answer.length() == 0)
            answer = "a";
        if (answer.length() > 15){
            if (answer.charAt(14) == '.'){
                answer = answer.substring(0,14);
            }else{
                answer = answer.substring(0,15);
            }
        }
        if (answer.length() < 3){
            char c = answer.charAt(answer.length()-1);
            while(answer.length() < 3){
                answer += c;
            }
        }

        return answer;
    }
}