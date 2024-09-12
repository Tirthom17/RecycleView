package com.exaimple.myapplication;

public class MainActivity2 {
    String Image,Titel,price,disc;


    MainActivity2  (String Image,String Titel,String price,String disc){
        this.Image=Image;
        this.Titel=Titel;
        this.price=price;
        this.disc=disc;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getTitel() {
        return Titel;
    }

    public void setTitel(String titel) {
        Titel = titel;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }
}
