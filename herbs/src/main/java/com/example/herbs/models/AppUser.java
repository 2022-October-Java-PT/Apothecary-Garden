package com.example.herbs.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class AppUser {

    @Id
    @GeneratedValue
    private Long id;
    private String userName;
    private String userPassword;

    @OneToMany (mappedBy = "user")
    @JsonIgnore
    private Collection<Herbs> favorites;

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public Collection<Herbs> getFavorites() {
        return favorites;
    }

    public AppUser() {
    }

    public AppUser(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public AppUser(String userName, String userPassword, Collection<Herbs> favorites) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.favorites = favorites;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return Objects.equals(id, appUser.id) && Objects.equals(userName, appUser.userName) && Objects.equals(userPassword, appUser.userPassword) && Objects.equals(favorites, appUser.favorites);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, userPassword, favorites);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", favorites=" + favorites +
                '}';
    }
}
