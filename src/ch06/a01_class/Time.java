package ch06.a01_class;

public class Time {
    private int hour;
    private int minute;
    private float second;

    public int getHour()     { return this.hour; }
    public int getMinute()   { return this.minute; }
    public float getSecond() { return this.second; }

    public void setHour(int hour) {
        if(hour < 0 || hour >= 24 ) { return; }

        this.hour = hour;
    }

    public void setMinute(int minute) {
        if(minute < 0 || minute >= 60) { return; }

        this.minute = minute;
    }

    public void setSecond(float second) {
        if(second < 0.0f || second >= 60.0f) { return; }

        this.second = second;
    }
}
