package com.example.herbs.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String userName;
    private String password;

    @OneToMany (mappedBy = "user")
    @JsonIgnore
    private Collection<Herbs> favorites;

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Collection<Herbs> getFavorites() {
        return favorites;
    }

    protected User() {
    }

    public User(Long id, String userName, String password, Collection<Herbs> favorites) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.favorites = favorites;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(userName, user.userName) && Objects.equals(password, user.password) && Objects.equals(favorites, user.favorites);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, password, favorites);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", herbs=" + favorites +
                '}';
    }
}
