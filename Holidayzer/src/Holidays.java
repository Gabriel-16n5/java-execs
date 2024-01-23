public class Holidays {
    private String date;
    private String holidayName;

    public Holidays( String date, String holidayName){
        this.date = date;
        this.holidayName = holidayName;
    }

    public String getHolidayName() {
        return holidayName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setHolidayName(String holidayName) {
        this.holidayName = holidayName;
    }

}
