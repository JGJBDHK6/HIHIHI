public class _16짝수는싫어요 {
    public class _16 {
        public static void main(String[] args) {
            int n = 50;
            int a = 0;
            for (int i = 1; i < n + 1; i++) {
                if (i % 2 != 0) {
                    a += 1;
                }
            }
            int[] h = new int[a];
            for (int i=1,b=0; i <n+1; i++) {
                if (i % 2 != 0) {
                    h[b]=i;
                    b += 1;
                }
            }
            for(int v= 0; v<h.length;v++){
                System.out.println(h[v]);
            }


        }
    }

// int a = 0;
//        for (int i=1; i <n+1; i++) {
//            if (i % 2 != 0) {
//                a += 1;
//            }
//        }
//
//        int[] h = new int[a];
//        for (int i=1,b=0; i <n+1; i++) {
//           if (i % 2 != 0) {
//                h[b]=i;
//                b += 1;
//            }
//        }
//        return h;
//    }
//}

}
