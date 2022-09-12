package com.volotea.qa.models;

public class OriginAndDestination {
    private String Start;
    private String Finish;
    private String Country;


    public OriginAndDestination(String start, String finish, String country) {
        Start = start;
        Finish = finish;
        Country = country;
    }

    public String getStart() {
        return Start;
    }

    public String getFinish() {
        return Finish;
    }

    public String getCountry() {
        return Country;
    }
}
