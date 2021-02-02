class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        
        if(length == 1){
            return new int[]{-1};
        }
        
        int[] answer = new int[length - 1];
        
        int minIndex = 0;
        for (int i = 0; i < arr.length;i++){
            if (arr[minIndex] > arr[i])
                minIndex = i;
        }
        
        for(int i = 0, j = 0; i < arr.length; i++){
            if (i != minIndex){
                answer[j++] = arr[i];
            }
        }
        return answer;
    }
}