package com.certuit.limesurvey.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by andre on 3/13/16.
 */
public class Survey {
    @SerializedName(value = "sid")
    private String sid;
    @SerializedName(value = "surveyls_title")
    private String surveylsTitle;
    @SerializedName(value = "startdate")
    private String startDate;
    @SerializedName(value = "expires")
    private String expires;
    @SerializedName(value = "active")
    private String active;

    private List<Group> grupos;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSurveylsTitle() {
        return surveylsTitle;
    }

    public void setSurveylsTitle(String surveylsTitle) {
        this.surveylsTitle = surveylsTitle;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public Survey() {
    }

    public Survey(String sid, String surveylsTitle, String startDate, String expires, String active) {
        this.sid = sid;
        this.surveylsTitle = surveylsTitle;
        this.startDate = startDate;
        this.expires = expires;
        this.active = active;
    }
}
