public class _15최빈값구하기 {
    public static void main(String[] args) {
        int yo[] = {2, 6, 5, 5, 5, 5, 9, 9, 9,9};  //주어진 배열
        int yoo[] = new int[yo.length]; //같은 숫자 갯수

        int max = 0; //같은 숫자 갯수 최댓값
        int resuit = 0; //최빈값 인덱스 번호
        int equal = 0; // 최댓값이 같은 갯수

        //같은 숫자 갯수 배열만들기
        for (int i = 0, x = 1; i < yo.length; i++) {
            for (int j = 1; j < yo.length; j++) {
                if (yo[i] == yo[j]) {
                    x += 1;
                }
            }
            yoo[i] = x;
            x = 0;
        }

        //최대값 구하기
        for(int j =0,b=0;j<yoo.length;j++ ) {
            if (yoo[j] > max) {
                max = yoo[j];
            }//최대값 구하기
        }
        //최대값 구한 것이 몇개 인지
        for(int j =0;j<yoo.length;j++ ) {
            if (max == yoo[j]) {
                equal += 1;
                resuit = j;
            }
        }
        //최대값보다 최대값이랑 같은 숫자갯수가 더 많으면 -1, 아니면 최빈값 출력
        System.out.println(equal>max?-1:yo[resuit]);
    }
}

//        int yoo[] = new int[array.length];
//        int g = 0;
//        int in = 0;
//        for (int i = 0, x = 1; i < array.length; i++) {
//            for (int j = 1; j < array.length; j++) {
//                if (array[i] == array[j]) {
//                    x += 1;
//                }
//            }
//            yoo[i] = x;
//            x = 0;
//        }
//
//        for(int j =0,b=0;j<yoo.length;j++ ) {
//            if (yoo[j] > g) {
//                g = yoo[j];
//
//            }//최대값 구하기
//        }
//        int b=0;
//
//        for(int j =0;j<yoo.length;j++ ){
//            if(g==yoo[j]){
//                b+=1;
//                in = j;
//            }
//
//        }
//        return  b>g?-1:array[in];
//    }
//}



