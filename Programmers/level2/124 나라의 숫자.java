class Solution {

    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        int value = 0;
        while(n >= 3){
            value = n % 3;
            if (value == 0){
                value = 4;
                n--;
            }
            sb.append(value);
            n /= 3;
        }
        if (n != 0)
            sb.append(n);
        sb.reverse();
        return new String(sb);
    }
}