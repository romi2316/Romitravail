package bean;

public class Time {

    private int hour;
    private int min;
    private int sec;

    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public void nextTime() {


        this.setSec(++this.sec);

        if (this.sec > 59) {
            this.setMin(++this.min);
            this.setSec(0);}

            if (this.min > 59) {
                this.setHour(++this.hour);
                this.setMin(0);}

                if (this.hour > 23) {
                    this.setHour(0);
                }

        System.out.println( hour + "h" + min + "min" + sec + "sec");}}