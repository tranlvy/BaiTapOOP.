public class MyDate {
    private int year, month, day;
    private static String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private static String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    private static int[] DAYSINMONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999)
            return false;
        if (month < 1 || month > 12)
            return false;
        int daysOfMonth = DAYSINMONTHS[month - 1];
        if (isLeapYear(year))
            daysOfMonth = 29;
        return day > 0 && day <= daysOfMonth;
    }

    public int getDayOfWeek(int year, int month, int day) {
        int[] centuryValues = {6, 4, 2, 0};
        int century = (year - 1) / 100;
        int century_value = centuryValues[century % 4];
        int lastTwoDigitYear = year % 100;
        int[] monthValues = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int month_value=0;
        if ( month_value<7 ) {
            if (isLeapYear(year) && month == 2) {
                month_value = 2;
            } else if (isLeapYear(year) && month == 1) {
                month_value = 6;
            } else if (!isLeapYear(year)) {
                 month_value = monthValues[month - 1];
            } else if (isLeapYear(year) && month!=2 && month!=1){
                month_value = monthValues[month-1];
            }
        }
        return (int) (century_value + lastTwoDigitYear + (lastTwoDigitYear / 4) + month_value + day) % 7;
    }


    public MyDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }

    public void setDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else
            throw new IllegalArgumentException(" Invalid year, month, or day! ");
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        if (isValidDate(year, month, day)) {
            this.year = year;
        } else
            throw new IllegalArgumentException(" Invalid year! ");
    }

    public void setMonth(int month) {
        if (isValidDate(year, month, day)) {
            this.month = month;
        } else
            throw new IllegalArgumentException(" Invalid month! ");
    }

    public void setDay(int day) {
        if (isValidDate(year, month, day)) {
            this.day = day;
        } else
            throw new IllegalArgumentException( " Invalid day! " );
    }

    public String toString(){
        if (isLeapYear(year) && month==2 && day==29){
            DAYSINMONTHS[1]=29;
        }
        return DAYS[getDayOfWeek(year, month, day)] + " " + day + " " + MONTHS[month-1] + " " + year;
    }

    public MyDate nextDay(){
        this.day++;
        if (day-1 == 29 && month==2 && isLeapYear(year)){
            this.day=1;
            this.month=3;
        }
        else if (day-1==DAYSINMONTHS[month-1] && month<12 && month!=2){
            this.day=1;
            this.month+=1;
        }
        else if (day-1==DAYSINMONTHS[month-1] && month==12){
            this.day=1;
            this.month=1;
            if(year<9999)
                this.year+=1;
        }
        if (day<1 || (day>DAYSINMONTHS[month-1] && month!=2 )) {
            throw new IllegalArgumentException( " Invalid day! " );
        }
        return this;
    }

    public MyDate nextMonth(){
        if( month+1 <=12){
            this.month++;
        }
        else {
            if (year+1<=9999 ){
                this.month=1;
                this.year++;
                if (day > DAYSINMONTHS[0]){
                    this.day=1;
                    this.month++;
                }
            }
            else
                throw new IllegalArgumentException( " Year out of range! " );
        }
        return this;
    }

    public MyDate nextYear(){
        if( !isLeapYear(year+1) && year+1<=9999 && month==2 && day==29){
            this.year++;
            this.day=1;
            this.month=3;
        }
        else if ( year +1 <=9999)
            this.year++;
        else
            throw new IllegalArgumentException( " Year out of range! " );
        return this;
    }

    public  MyDate previousDay(){
        if ( day>1 && day<=DAYSINMONTHS[month-1]){
            this.day--;
        }
        else if (day==1 && year-1>=1 && year-1<9999 ){
            if ( month==1){
                this.day=DAYSINMONTHS[11];
                this.month=12;
                this.year--;
            }
            else if( month>1 && month<=12 ) {
                if (month == 3 && isLeapYear(year)) {
                    this.day = 29;
                    this.month = 2;
                }
                else {
                    this.day = DAYSINMONTHS[month-1];
                    this.month--;
                }
            }
            else
                throw new IllegalArgumentException( " Year out of range! " );
        }
        return this;
    }

    public MyDate previousMonth(){
        if (month>1 && month<=12){
           if ( day>=29 && day<=31 && month==3 && !isLeapYear(year)){
               this.day=day-28;
               this.month=3;
           }
           else if (month==1){
               this.month=12;
               if(isValidDate(year-1,month,day)){
                   this.year--;
               }
               else
                   throw new IllegalArgumentException( " Year out of range! " );
           }
           else {
               if ( day == DAYSINMONTHS[month-1]){
                   if ( DAYSINMONTHS[month-1] > DAYSINMONTHS[month-2]) {
                       this.day = DAYSINMONTHS[month - 2];
                       this.month--;
                   }
                   else if ( DAYSINMONTHS[month-1] <= DAYSINMONTHS[month-2])
                       this.month--;
               }
               else
                   this.month--;
           }
        }
        return this;
    }

    public MyDate previousYear() {
        if ( year<1 && year>9999 ){
            throw new IllegalArgumentException( " Year out of range! " );
        }
        this.year-=1;
        if (isLeapYear(year+1) && day==29 && month==2){
            this.day=28;
        }
        if (year<1 || year>9999){
            throw new IllegalArgumentException( " Year out of range! " );
        }
        return this;
    }
}