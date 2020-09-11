package models;

public class ExpirationDate {
    private int month;
    private int year;

    public ExpirationDate(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
