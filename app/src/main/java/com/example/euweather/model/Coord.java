package com.example.euweather.model;

public class Coord {
    private Float lon;
    private Float lat;

    public Coord() { }

    public Float getLon() { return lon; }
    public void setLon(Float lon) { this.lon = lon; }

    public Float getLat() { return lat; }
    public void setLat(Float lat) { this.lat = lat; }

    @Override
    public String toString() {
        return "Coord{" +
                "lon=" + lon +
                ", lat=" + lat +
                '}';
    }
}
