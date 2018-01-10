package com.e1sol.shogoleeedee.models;

/**
 * Created by User on 1/6/2018.
 */

public class Chefs {

    private int chefImage;
    private String chefName;
    private  String chefLocation;
    private int chefReview;
    public Chefs(int chefImage, String chefName, String chefLocation,int chefReview)
    {
        this.chefImage = chefImage;
        this.chefName = chefName;
        this.chefLocation = chefLocation;
        this.chefReview = chefReview;

    }

    public int getChefImage() {
        return chefImage;
    }

    public void setChefImage(int chefImage) {
        this.chefImage = chefImage;
    }

    public String getChefName() {
        return chefName;
    }

    public void setChefName(String chefName) {
        this.chefName = chefName;
    }

    public String getChefLocation() {
        return chefLocation;
    }

    public void setChefLocation(String chefLocation) {
        this.chefLocation = chefLocation;
    }

    public int getChefReview() {
        return chefReview;
    }

    public void setChefReview(int chefReview) {
        this.chefReview = chefReview;
    }
}
