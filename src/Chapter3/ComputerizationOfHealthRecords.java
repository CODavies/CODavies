package Chapter3;

public class ComputerizationOfHealthRecords {
    public ComputerizationOfHealthRecords(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    String firstName;
    String lastName;
    String gender;
    int dateOfBirth;
    private int month, day, year;
    public static int maximumHeartRate = 220;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstname() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public String userName() {
        return firstName + " " + lastName;
    }

    public void setDateOfBirth(int month, int day, int yearOfBirth) {
        this.dateOfBirth = Integer.parseInt(String.valueOf(month / day / yearOfBirth));
    }
public int getDateOfBirth(){
    System.out.println(dateOfBirth);
        return dateOfBirth;
}
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = (month >= 1 && month <= 12) ? month : 0;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = (day >= 1 && day <= 31) ? this.day : 0;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAge() {
        return java.util.Calendar.getInstance().get(java.util.Calendar.YEAR) - year;
    }

    public int getMaximumHeartRate() {
        return maximumHeartRate - getAge();
    }

    public String getTargetHeartRate() {
        return String.format("%.0f - %.0f", getMaximumHeartRate() * 0.5, getMaximumHeartRate() * 0.85);
    }
}
