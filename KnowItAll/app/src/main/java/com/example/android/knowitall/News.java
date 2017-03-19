package com.example.android.knowitall;

/**
 * Created by Preethi on 12/2/16.
 */

public class News {
    private String marticle;

    private String msection;

    private String murl;

    public News(String marticle, String msection, String murl) {
        this.marticle = marticle;
        this.msection = msection;
        this.murl = murl;
    }

    public String getMarticle() {
        return marticle;
    }

    public void setMarticle(String marticle) {
        this.marticle = marticle;
    }

    public String getMsection() {
        return msection;
    }

    public void setMsection(String msection) {
        this.msection = msection;
    }

    public String getMurl() {
        return murl;
    }

    public void setMurl(String murl) {
        this.murl = murl;
    }
}
