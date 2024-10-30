public class MyTime {
    private int hour, minute, second;
    public MyTime(){
        this.hour=0;
        this.minute=0;
        this.second=0;
    }

    public MyTime( int hour, int minute, int second) {
        if (hour>=0 && hour<24 && minute>=0 && minute<60 && second>=0 && second<60) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
       else{
           throw new IllegalArgumentException( " Invalid time! " );
        }
    }
    public void setTime( int hour, int minute, int second){
        if( (hour>=0 && hour<24 && minute>=0 && minute<60 && second>=0 && second<60)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
        else {
            throw new IllegalArgumentException( " Invalid time! " );
        }
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public void setHour( int hour ){
        this.hour=hour;
    }
    public void setMinute( int minute ){
        this.minute=minute;
    }
    public void setSecond( int second ){
        this.second=second;
    }
    public String toString(){
        return String.format(" %02d:%02d:%02d ",hour,minute,second);
    }
    public MyTime nextSecond(){
        if( second+1==60 ) {
            this.second -= 59;
            this.minute += 1;

            if (this.minute == 60) {
                this.minute = 0;
                this.hour += 1;
            }
            if (this.hour == 24) {
                this.hour = 0;
            }
        }
        else
            this.second++;
        return this;
    }
    public MyTime nextMinute() {
        if (minute + 1 == 60) {
            this.minute -= 59;
            this.hour += 1;
            if (this.hour == 24) {
                this.hour = 0;
            }
        }
        else
            this.minute++;
        return this;
    }
    public MyTime nextHour(){
        if ( hour+1==24 ){
            this.hour-=23;
        }
        else
            this.hour++;
        return this;
    }
    public MyTime previousSecond(){
        if ( second-1<0 ) {
            this.second += 59;
            this.minute--;
            if (this.minute < 0) {
                this.minute = 59;
            }
            if (this.hour < 0) {
                this.hour = 23;
            }
        }
        else
            this.second--;
        return this;
    }
    public MyTime previousMinute(){
        if ( minute-1<0 ){
            this.minute+=59;
            this.hour--;
            if ( this.hour<0 ) {
                this.hour = 23;
            }
        }
        else
            this.minute--;
        return this;
    }
    public MyTime previousHour(){
        if ( hour-1<0 ){
            this.hour-=23;
        }
        else
            this.hour--;
        return this;
    }
}
