class Solution {
    public double solution(int[] numbers) {
        double x = 0;
        for(int i=0; i<numbers.length; i++){
            x = x+numbers[i];

        }
        return x/(numbers.length);
    }

}

public class _10배열의평균값 {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        int[] a = {1,2,3,4,5};
        System.out.println(s1.solution(a));
    }
}

