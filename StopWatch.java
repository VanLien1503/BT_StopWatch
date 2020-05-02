package BT_StopWatch;

import java.util.Date;

public class StopWatch {
    private Date startTime,andTime;
    private double start;
    private double end;
    Date date=new Date();

    // tạo phương thức

    public Date startTime(){
        Date time=date;
        return time;
    }
    public Date getStartTime(){
        return startTime;
    }
    public Date getEndTime(){
        return  andTime;
    }

    public void start(){
        this.andTime=startTime;
        this.start= System.currentTimeMillis();
    }
    public void end(){
        this.andTime=startTime();
        this.end=System.currentTimeMillis();
    }
    public double getElapsedTime(){
        return (end-start);
    }

}
