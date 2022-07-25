package com.codeup.adlister.models.models;

public class Ad {
    private long id;
    private long userId;
    private String title;
    private String description;
    private String park_name;
    private int elevation;
    private int hike_distance;
    private int max_occupancy;

    public Ad(long id, long userId, String title, String description, String park_name, int elevation, int hike_distance, int max_occupancy) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.park_name = park_name;
        this.elevation = elevation;
        this.hike_distance = hike_distance;
        this.max_occupancy = max_occupancy;
    }

    public Ad(Long userId,  String title, String park_name, String description, String elevation, String hike_distance, String max_occupancy) {
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.park_name = park_name;
        this.elevation = Integer.parseInt(elevation);
        this.hike_distance = Integer.parseInt(hike_distance);
        this.max_occupancy = Integer.parseInt(max_occupancy);
    }


    public Ad(long userId, String title, String description, String park_name, int elevation, int hike_distance, int max_occupancy) {
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.park_name = park_name;
        this.elevation = elevation;
        this.hike_distance = hike_distance;
        this.max_occupancy = max_occupancy;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPark_name() {
        return park_name;
    }

    public void setPark_name(String park_name) {
        this.park_name = park_name;
    }

    public int getElevation() {
        return elevation;
    }

    public void setElevation(int elevation) {
        this.elevation = elevation;
    }

    public int getHike_distance() {
        return hike_distance;
    }

    public void setHike_distance(int hike_distance) {
        this.hike_distance = hike_distance;
    }

    public int getMax_occupancy() {
        return max_occupancy;
    }

    public void setMax_occupancy(int max_occupancy) {
        this.max_occupancy = max_occupancy;
    }
}

