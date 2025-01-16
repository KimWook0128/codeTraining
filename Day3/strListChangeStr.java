package Day3;

public class strListChangeStr {
    class Solution {
        public String solution(String[] arr) {
            String answer = "";
            if (1 <= arr.length && arr.length <= 200) {
                for(int i = 0; i < arr.length; i++) {
                    if (arr[i].equals(arr[i].toLowerCase())) {
                        answer = answer + arr[i];
                    }
                }
            }
            return answer;
        }
    }
}
