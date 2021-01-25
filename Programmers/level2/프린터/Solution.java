import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int[] temp = new int[arr.length]; //���̸�ŭ �Ҵ�
        
        // ó�� �ʱ�ȭ
        int size = 1;
        temp[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            if(temp[size-1] != arr[i]){
                temp[size++] = arr[i];
            }
        }
        
        //����
        answer = new int[size];
        for(int i=0;i<size;i++){
            answer[i] = temp[i];
        }

        return answer;
    }
}