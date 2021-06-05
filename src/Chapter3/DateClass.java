package Chapter3;

public class DateClass {
  private int month, day, year;
    public DateClass(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month++;
    }

    public void setMonth(int month) {
        this.month = (month >=1 && month<=12)? month: 0;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = (day >=1 && day <=31)? this.day: 0;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {

        this.year =(year  > 0000 )? year : 0000;
    }
    public int displayDate(){

      return getMonth()/getDay()/getYear();
    }
    }

