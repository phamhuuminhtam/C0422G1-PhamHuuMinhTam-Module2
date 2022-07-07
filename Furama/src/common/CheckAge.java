package common;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;

public class CheckAge {
    public static boolean checkAge(LocalDate age){
        LocalDate now = LocalDate.now();
        if(Period.between(age,now).getYears() >=18 && Period.between(age,now).getYears() <=100  ){
            return true;
        }else  return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập ngày sinh");
        LocalDate day = null;
        try{
           day  = LocalDate.parse(scanner.nextLine());
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(day);
        LocalDate age = LocalDate.parse("1922-08-10");
        LocalDate now = LocalDate.now();
        System.out.println(Period.between(age,now).getYears());
        System.out.println(checkAge(age));
    }

}
