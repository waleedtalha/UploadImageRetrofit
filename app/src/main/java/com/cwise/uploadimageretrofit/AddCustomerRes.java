package com.cwise.uploadimageretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AddCustomerRes {

    @SerializedName("info")
    @Expose
    private List<String> info = null;
    @SerializedName("status")
    @Expose
    private Integer status;

    public List<String> getInfo() {
        return info;
    }

    public void setInfo(List<String> info) {
        this.info = info;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
