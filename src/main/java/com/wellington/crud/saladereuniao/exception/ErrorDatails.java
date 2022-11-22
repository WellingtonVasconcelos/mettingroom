package com.wellington.crud.saladereuniao.exception;

import java.util.Date;

public class ErrorDatails {

    private Date timestamp;
    private String massage;
    private String datails;

    public ErrorDatails(Date timestamp, String massage, String datails) {
        super();
        this.timestamp = timestamp;
        this.massage = massage;
        this.datails = datails;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMassage() {
        return massage;
    }

    public String getDatails() {
        return datails;
    }

}
