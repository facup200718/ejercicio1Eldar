package services;

import types.Brand;

import java.util.Calendar;
import java.util.Date;

public class InterestRate {

    public double calculateRate(Brand brand){

        return rateLimits(brandRates(brand));

    }

    private double rateLimits(double rate){
        rate = rate > 5 ? 5 : rate;
        rate = rate < 0.3f ? 0.3f : rate;
        return rate;
    }

    private double brandRates(Brand brand){

        Date date = new Date();

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int year =  cal.get(Calendar.YEAR);

        double rate = 0;

        switch(brand){

            case VISA : rate = month / year;
                break;
            case AMEX : rate = day / 0.5f;
                break;
            case NARA : rate = month / 0.1f;
                break;
            default : rate = 0;
                break;

        }

        return rate;

    }

}
