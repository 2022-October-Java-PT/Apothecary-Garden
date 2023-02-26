package com.example.herbs.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class AppUser {

    @Id
    @GeneratedValue
    private Long id;
    private String userName;
    private String userPassword;

    @OneToOne(cascade = CascadeType.ALL)
    private Favorites userFavorites;

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public Favorites getUserFavorites() {
        return userFavorites;
    }

    public AppUser() {
    }

    public AppUser(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public AppUser(String userName, String userPassword, Favorites userFavorites) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userFavorites = userFavorites;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return Objects.equals(id, appUser.id) && Objects.equals(userName, appUser.userName) && Objects.equals(userPassword, appUser.userPassword) && Objects.equals(userFavorites, appUser.userFavorites);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, userPassword, userFavorites);
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userFavorites=" + userFavorites +
                '}';
    }
}
