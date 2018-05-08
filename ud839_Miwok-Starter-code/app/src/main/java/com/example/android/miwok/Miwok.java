package com.example.android.miwok;

/**
 * Created by FaiyazHuq on 2018-05-06.
 */

public class Miwok {
    private String defaultTranslation;

    private String miwokTranslation;

    private int imageResourceID;

    public Miwok(String defaultTranslation, String miwokTranslation) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }

    public Miwok(String defaultTranslation, String miwokTranslation, int imageResourceID) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageResourceID = imageResourceID;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }
}
