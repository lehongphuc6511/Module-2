package Exercise;
import java.text.SimpleDateFormat;
import  java.util.Date;

import java.time.DateTimeException;

public class StopWatch {
    private float starTime;
    private float endTime;

    public StopWatch(){
    }

    public StopWatch(float starTime, float endTime) {
        this.starTime = starTime;
        this.endTime = endTime;
    }

    public float getStarTime() {
        return starTime;
    }

    public void setStarTime(float starTime) {
        this.starTime = starTime;
    }

    public float getEndTime() {
        return endTime;
    }

    public void setEndTime(float endTime) {
        this.endTime = endTime;
    }

    public double dateTime(){
        return starTime;
    }

    // Doing

    public static void main(String[] args) {
        Date date = new Date();
        StopWatch StopWatch = new StopWatch();
        SimpleDateFormat dinhDangThoiGian = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy ");






    }
}
