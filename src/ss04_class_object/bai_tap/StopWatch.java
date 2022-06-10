package ss04_class_object.bai_tap;

import java.util.Date;

public class StopWatch {
    private Date startTime, endTime;

    public StopWatch() {
    }

    public StopWatch(Date startTime, Date endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public Date start() {

        return this.startTime = new Date();
    }

    public Date stop() {

        return this.endTime = new Date();
    }

    public long getElapsedTime() {
        return getEndTime().getTime() - getStartTime().getTime();
    }

    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        watch.start();
        for (long i = 0; i < 999999999; i++) {

        }
        watch.stop();
        System.out.println(watch.getElapsedTime());

    }
}
