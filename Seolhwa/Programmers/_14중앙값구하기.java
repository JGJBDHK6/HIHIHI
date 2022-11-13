public class _14중앙값구하기 {
    public static void main(String[] args) {
        int[] array = {9 ,-1 ,0,5,-2};

        for(int n = 0,i=1; n<array.length; ){
            for(; i<array.length;){
                if(array[n]<array[i]){
                    int x = array[n];
                    int h = array[i];
                    array[n] = h;
                    array[i] = x;
                }
                i++;
            }
            n++;
            i=n+1;
        }
        double x=array.length/2;
        int j = (int)x;
        System.out.println( array[j]);
    }
}

//class Solution {
//    public int solution(int[] array) {
//       for(int n = 0,i=1; n<array.length; ){
//            for(; i<array.length;){
//                if(array[n]<array[i]){
//                    int x = array[n];
//                    int h = array[i];
//                    array[n] = h;
//                    array[i] = x;
//                }
//                i++;
//            }
//            n++;
//            i=n+1;
//        }
//        double x=array.length/2;
//        int j = (int)x;
//        return array[j];
//    }
//}

