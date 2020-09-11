package models;

public class ExpirationDate {
    private String month;
    private String year;

    public ExpirationDate(String month, String year) {
        this.month = month;
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }
}
