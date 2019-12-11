package com.example.tkl.coolweather.db;

import android.util.Log;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {

    private static final String TAG = "County";

    private int id;
    private String countyName;
    private String weatherId;

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
//        Log.i(TAG, "getCountyName: countyName:" + countyName);
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
