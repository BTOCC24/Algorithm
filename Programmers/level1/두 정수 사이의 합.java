import java.util.stream.LongStream;
class Solution {
    public long solution(int a, int b) {
        return (a + b) * (long)(Math.abs(b - a) + 1) / 2;
    }
}