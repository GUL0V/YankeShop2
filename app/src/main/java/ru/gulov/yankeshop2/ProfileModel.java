package ru.gulov.yankeshop2;

public class ProfileModel {
    public ProfileModel(String name, String email, String pictureUrl, String uid) {
        this.name = name;
        this.email = email;
        this.pictureUrl = pictureUrl;
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    String name;
    String email;
    String pictureUrl;
    String uid;

}
