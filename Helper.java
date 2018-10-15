package com.example.home.newcare;

/**
 * Created by home on 29-Dec-17.
 */

public class Helper
{
    String name,number,email,website;
    int image;

    public Helper(String name, String number, String email, String website, int image) {
        this.name = name;
        this.number = number;
        this.email = email;
        this.website = website;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
