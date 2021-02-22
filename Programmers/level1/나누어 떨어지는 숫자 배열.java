import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] result = Arrays.stream(arr).filter(x-> x % divisor == 0).sorted().toArray();
        return (result.length != 0) ? result : new int[]{-1};
    }
}

// import java.util.List;
// import java.util.ArrayList;

// class Solution {
//     public int[] solution(int[] arr, int divisor) {
//         List<Integer> list = new ArrayList<>();
//         for(int i=0; i < arr.length; i++){
//             if (arr[i] % divisor == 0){
//                 list.add(arr[i]);
//             }
//         }
//         if (list.size() == 0){
//             return new int[]{-1};
//         }
//         return list.stream().mapToInt(Integer::intValue).sorted().toArray();
//     }
// }