package com.models;

public class Mail {
    private String language;
    private String pageSize;
    private String spamFillter;
    private String signatuure;

    public Mail() {
    }

    public Mail(String language, String pageSize, String spamFillter, String signatuure) {
        this.language = language;
        this.pageSize = pageSize;
        this.spamFillter = spamFillter;
        this.signatuure = signatuure;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getSpamFillter() {
        return spamFillter;
    }

    public void setSpamFillter(String spamFillter) {
        this.spamFillter = spamFillter;
    }

    public String getSignatuure() {
        return signatuure;
    }

    public void setSignatuure(String signatuure) {
        this.signatuure = signatuure;
    }
}
