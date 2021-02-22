class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(Integer.toString(n, 3));
        sb.reverse();
        answer = Integer.parseInt(new String(sb), 3);
        return answer;
    }
}

// class Solution {
//     public int solution(int n) {
//         int answer = 0;
//         int r = 1;

//         StringBuilder sb = new StringBuilder();
//         while(n >= 3){
//             sb.append(Integer.toString(n % 3));
//             n /= 3;
//         }
//         sb.append(Integer.toString(n % 3));
//         for (int index = sb.length() - 1; index >= 0; index--){
//             int value = (int)(sb.charAt(index) - '0');
//             answer += (r * value);
//             r *= 3;
//         }

//         return answer;
//     }
// }