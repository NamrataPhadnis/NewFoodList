package com.example.newfoodlist;




import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cake {

    @SerializedName("F_ID")
    @Expose
    private String fID;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("R_ID")
    @Expose
    private String rID;
    @SerializedName("images_path")
    @Expose
    private String imagesPath;
    @SerializedName("options")
    @Expose
    private String options;

    public String getFID() {
        return fID;
    }

    public void setFID(String fID) {
        this.fID = fID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRID() {
        return rID;
    }

    public void setRID(String rID) {
        this.rID = rID;
    }

    public String getImagesPath() {
        return imagesPath;
    }

    public void setImagesPath(String imagesPath) {
        this.imagesPath = imagesPath;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

}