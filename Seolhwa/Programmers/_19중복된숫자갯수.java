public class _19중복된숫자갯수 {
    public static void main(String[] args) {
        int[] array = {1,2,5,5,6,4,2};
        int n =5;
        int answer = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i]==n){
                answer+=1;
            }
        }

        System.out.println(answer);
    }
}
