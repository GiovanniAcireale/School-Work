package assignment9;
public class assignment9test {
    //Write a test program hat creates two MyDate objects (using new MyDate() and new MyDate(34355555133101L) and displays their year, month, and day.
    public static void main(String[] args) {

        //two MyDate objects
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133101L);

        //display year, month, day
        System.out.println("Date1: The year is " + date1.getYear() + ", the month is " + date1.getMonth() + ", and the day is " + date1.getDay());
        System.out.println("Date2: The year is " + date2.getYear() + ", the month is " + date2.getMonth() + ", and the day is " + date2.getDay());
    }
}
