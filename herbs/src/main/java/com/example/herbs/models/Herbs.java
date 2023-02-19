package com.example.herbs.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Herbs {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Lob
    private String description;

    @Lob
    private String fact;

    private String picture; //will be a file path or link to picture

    private String science; //specific link to scientific article

    @ManyToOne
    private AppUser user;

    @ManyToMany
    private Collection<Illness> illnesses;

    @Lob
    private ArrayList<String> sideEffects;

    public Herbs (){};

    public Herbs(String name, String description, String fact, String picture, String science, AppUser user, Collection<Illness> illnesses, ArrayList<String> sideEffects) {
        this.name = name;
        this.description = description;
        this.fact = fact;
        this.picture = picture;
        this.science = science;
        this.user = user;
        this.illnesses = illnesses;
        this.sideEffects = sideEffects;
    }

    public Herbs(String name, String description, String fact, String picture, String science, Collection<Illness> illnesses, ArrayList<String> sideEffects) {
        this.name = name;
        this.description = description;
        this.fact = fact;
        this.picture = picture;
        this.science = science;
        this.illnesses = illnesses;
        this.sideEffects = sideEffects;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getFact() {
        return fact;
    }

    public String getPicture() {
        return picture;
    }

    public String getScience() {
        return science;
    }

    public Collection<Illness> getIllnesses() {
        return illnesses;
    }

    public ArrayList<String> getSideEffects() {
        return sideEffects;
    }

    public AppUser getUser() {
        return user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herbs herbs = (Herbs) o;
        return Objects.equals(id, herbs.id) && Objects.equals(name, herbs.name) && Objects.equals(description, herbs.description) && Objects.equals(fact, herbs.fact) && Objects.equals(picture, herbs.picture) && Objects.equals(science, herbs.science) && Objects.equals(user, herbs.user) && Objects.equals(illnesses, herbs.illnesses) && Objects.equals(sideEffects, herbs.sideEffects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, fact, picture, science, illnesses, sideEffects);
    }

    @Override
    public String toString() {
        return "Herbs{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", fact='" + fact + '\'' +
                ", picture='" + picture + '\'' +
                ", science='" + science + '\'' +
                ", user=" + user +
                ", illnesses=" + illnesses +
                ", sideEffects=" + sideEffects +
                '}';
    }
}
