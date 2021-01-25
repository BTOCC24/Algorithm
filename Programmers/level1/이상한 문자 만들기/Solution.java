class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        String[] arr = s.split(" ");
        for(int i=0;i<arr.length;i++){
            char[] str = arr[i].toCharArray();
            for(int j=0;j<str.length;j+=2){
                str[j] = str[j] + ('a' - 'A');
            }
            System.out.println(str);
        }
        String answer = "";
        return answer;
    }
}