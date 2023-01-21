package assignment9;
import java.util.GregorianCalendar;

class MyDate {
    //The data fields year, month, and day that represent a date. Month is 0-based, i.e., 0 is for January.
    private int year, month, day;

    public MyDate(){
        //creates a MyDate object for the current date
        GregorianCalendar gcal = new GregorianCalendar();
        this.year = gcal.get(GregorianCalendar.YEAR);
        this.month = gcal.get(GregorianCalendar.MONTH);
        this.day = gcal.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public MyDate(Long eTime){
        //constructs a MyDate object with a specified elapsed time since midnight, january 1, 1970, in milliseconds
        this.year = 1970 + (int)(eTime / 31536000000L);

        this.month = (int)((eTime % 31536000000L) / 2678400000L);

        this.day = (int)((eTime % 31536000000L) % 2678400000L) / 86400000;
    }

    public MyDate(int year, int month, int day){
        //constructs a MyDate object with the specified year, month, and day
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //Three getter methods for the data fields year, month, and day respectively 
    public int getYear(){
        //year getter
        return year;
    }
    public void setYear(int year){
        //year setter
        this.year = year;
    }

    public int getMonth(){
        //month getter
        return month;
    }
    public void setMonth(int month){
        //month setter
        this.month = month;
    }

    public int getDay(){
        //day getter
        return day;
    }
    public void setDay(int day){
        //day setter
        this.day = day;
    }

    public void setDate(long ms){
        //sets a new date using the elapsed time
        GregorianCalendar gcal = new GregorianCalendar();
        gcal.setTimeInMillis(ms);
        year = gcal.get(GregorianCalendar.YEAR);
        month = gcal.get(GregorianCalendar.MONTH);
        day = gcal.get(GregorianCalendar.DAY_OF_MONTH);
    }

}
