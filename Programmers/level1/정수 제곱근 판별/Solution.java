import java.lang.Math;

class Solution {
    public long solution(long n) {
        long answer = -1;
        long sqrt = (int)Math.sqrt(n);
        if (sqrt*sqrt == n){
            return (sqrt + 1)*(sqrt + 1);
        }else{
            return -1;
        }
    }
}