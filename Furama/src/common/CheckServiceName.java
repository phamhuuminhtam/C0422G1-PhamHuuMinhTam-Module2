package common;

import java.util.Scanner;

public class CheckServiceName {
    public static boolean checkValidateName(String name,String regex){
        return name.matches(regex);
    }

}
