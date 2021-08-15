package com.pens.tracing;

public class MyLocation {
    private double latitude;
    private double logitude;

    public MyLocation(double latitude, double logitude){
        this.latitude = latitude;
        this.logitude = logitude;
    }
    public MyLocation(){};

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLogitude() {
        return logitude;
    }

    public void setLogitude(double logitude) {
        this.logitude = logitude;
    }
}
