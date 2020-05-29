package com.example.newfoodlist;


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CakeList {

    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("prprice")
    @Expose
    private List<Cake> prprice = null;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Cake> getPrprice() {
        return prprice;
    }

    public void setPrprice(List<Cake> prprice) {
        this.prprice = prprice;
    }

}