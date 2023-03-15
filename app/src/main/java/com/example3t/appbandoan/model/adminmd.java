package com.example3t.appbandoan.model;

import java.util.ArrayList;

public class adminmd {
    boolean success;
    String message;
    ArrayList<admin> result;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ArrayList<admin> getResult() {
        return result;
    }

    public void setResult(ArrayList<admin> result) {
        this.result = result;
    }
}
