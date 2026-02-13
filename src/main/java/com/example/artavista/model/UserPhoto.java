package com.example.artavista.model;

import jakarta.persistence.ManyToOne;

public class UserPhoto extends BaseEntity{
    private User user;
    private Photo photo;

    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne
    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }
}
