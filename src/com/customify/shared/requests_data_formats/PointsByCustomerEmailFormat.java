package com.customify.shared.requests_data_formats;

import java.io.Serializable;

public class PointsByCustomerEmailFormat implements Serializable {
    private String email;

    public PointsByCustomerEmailFormat(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}