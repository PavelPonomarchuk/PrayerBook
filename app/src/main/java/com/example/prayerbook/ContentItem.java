package com.example.prayerbook;

public class ContentItem {
    private String prayerName;
    private String prayerText;

    public ContentItem (String prayerName, String prayerText) {
        this.prayerName = prayerName;
        this.prayerText = prayerText;
    }

    public String getPrayerName(){
        return prayerName;
    }

    public String getPrayerText(){
        return prayerText;
    }
}
