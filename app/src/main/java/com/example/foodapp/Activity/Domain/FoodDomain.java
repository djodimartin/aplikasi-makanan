package com.example.foodapp.Activity.Domain;

import java.io.Serializable;

public class FoodDomain implements Serializable {
    private String title;
    private String Pic;
    private String Desrciption;
    private Double fee;
    private int numberInCart;

    public FoodDomain(String title, String pic, String desrciption, Double fee) {
        this.title = title;
        Pic = pic;
        Desrciption = desrciption;
        this.fee = fee;
    }

    public FoodDomain(String title, String pic, String desrciption, Double fee, int numberInCart) {
        this.title = title;
        Pic = pic;
        Desrciption = desrciption;
        this.fee = fee;
        this.numberInCart = numberInCart;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return Pic;
    }

    public void setPic(String pic) {
        Pic = pic;
    }

    public String getDesrciption() {
        return Desrciption;
    }

    public void setDesrciption(String desrciption) {
        Desrciption = desrciption;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public int getNumberInCart() {
        return numberInCart;
    }

    public void setNumberInCart(int numberInCart) {
        this.numberInCart = numberInCart;
    }
}
