public class GiaiThuat {
    public static void main(String[] args) {

        for (int i = 1; i<= 5;i++){
            for (int j = 1;j <=5; j++ ) {
                if (j <= 5 - i) {
                    System.out.print("  ");
                } else if (j == 5 - i + 1) {
                    System.out.print(i);
                } else {
                    System.out.print("  ");
                }
            }

            for (int k=1;k<=5;k++){
                if (k== i ){
                    System.out.print(i);
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j) {
                    System.out.print(5 - i);
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = 9; j >=i ; j--) {
                if (j==5-i){
                    System.out.print(j);
                }else {
                    System.out.print("  ");
                }
            }

            System.out.println();


//        for (int k = 5; k >= 1; k--) {
//            for (int j = 1; j < k; j++) {
//                if (j == k - 1) {
//                    System.out.print(j);
//                } else {
//                    System.out.print("  ");
//                }
//
//
//            }
//            System.out.println();
//        }
    }
}}

