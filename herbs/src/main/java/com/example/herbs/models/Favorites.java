package com.example.herbs.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Favorites {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private AppUser appUser;

    @ManyToMany
    private Collection<Herbs> favorites;

    public Favorites () {}

    public Favorites(AppUser appUser) {
        this.appUser = appUser;
    }

    public Favorites(AppUser appUser, Collection<Herbs> favorites) {
        this.appUser = appUser;
        this.favorites = favorites;
    }

    public Long getId() {
        return id;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public Collection<Herbs> getFavorites() {
        return favorites;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Favorites favorites1 = (Favorites) o;
        return Objects.equals(id, favorites1.id) && Objects.equals(appUser, favorites1.appUser) && Objects.equals(favorites, favorites1.favorites);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, appUser, favorites);
    }

    @Override
    public String toString() {
        return "Favorites{" +
                "id=" + id +
                ", appUser=" + appUser +
                ", favorites=" + favorites +
                '}';
    }
}
