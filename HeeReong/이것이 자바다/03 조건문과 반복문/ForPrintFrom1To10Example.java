
// 기본 for문
//public class ForPrintFrom1To10Example {
//    public static void main(String[] args) {
//        for(int i=1; i<=10; i++) {
//            System.out.println(i);
//        }
//    }
//}


// for문 안 초기화식 생략하기
// public class ForPrintFrom1To10Example {
//    public static void main(String[] args) {
//        int i = 1;
//      for(; i<=10; i++) {
//            System.out.println(i);
//        }
//    }
//}


// for문 안 초기화, 조건, 증감식 2건씩
public class ForPrintFrom1To10Example {
    public static void main(String[] args) {
        for(int i=0, j=100; i<=50 && j>=50; i++, j--) {
            System.out.println(i);
            System.out.println(j);
        }
    }
}