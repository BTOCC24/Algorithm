class Solution {
    public String solution(String s) {
        int len = s.length();
        int pos = len / 2;
        if (len % 2 == 0){
            return s.substring(pos - 1, pos + 1);
        }else{
            return s.substring(pos, pos + 1);
        }
    }
}