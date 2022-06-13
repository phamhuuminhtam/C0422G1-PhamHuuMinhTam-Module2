package giai_thuat;

public class test {
    public static void main(String[] args) {
        System.out.println(m(1,2,3,4,5,6,7,8,9));
    }
    static int m(int...x) {
        int b = 0;
        for(int a:x){
            b+=a;
        }
        return b;
    }
}
