package ss19_regex_string.bai_tap;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        String regex = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)";
        String[] arr = {"(84)-(0978489648)", "(84)-(9978489648)", "(842)-(09784896248)", "(84)(0978489648)", "(91)-(0123456789)"};
        boolean check;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(check = arr[i].matches(regex));
        }
    }
}


