package com.tfhkx.entity;

public class Area {
    private int id;
    private String name;
    private String weather_id;

    public Area() {
    }

    public Area(int id, String name,String weather_id) {
        this.id = id;
        this.name = name;
        this.weather_id=weather_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeather_id() {
        return weather_id;
    }

    public void setWeather_id(String weather_id) {
        this.weather_id = weather_id;
    }

}
