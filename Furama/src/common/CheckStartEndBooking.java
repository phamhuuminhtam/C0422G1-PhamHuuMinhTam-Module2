package common;

import java.time.LocalDate;
import java.time.Period;

public class CheckStartEndBooking {
    public static boolean checkStartDay(LocalDate startDay){
        LocalDate now = LocalDate.now();
                if (Period.between(now,startDay).getDays() <0  ){

                    try {
                        throw new UserException("Ngày bắt đầu trước ngày hiện tại");

                    } catch (UserException e) {
                        e.printStackTrace();
                        return false;
                    }
                }else return true;
    }
    public static boolean checkStartEndDay(LocalDate startDay,LocalDate endDay){
        if(Period.between(startDay,endDay).getDays()<0){
            try {
                throw  new UserException("Ngày kết thúc trước ngày bắt đầu");
            } catch (UserException e) {
                e.printStackTrace();
                return false;
            }
        }else return true;
    }
}
