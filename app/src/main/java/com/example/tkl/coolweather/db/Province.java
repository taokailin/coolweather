package com.example.tkl.coolweather.db;

import android.util.Log;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {

    private static final String TAG = "Province";

    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
//        Log.i(TAG, "getProvinceName: provincename:" + provinceName);
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
