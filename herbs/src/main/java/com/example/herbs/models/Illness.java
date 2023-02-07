package com.example.herbs.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Illness {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "illnesses")
    @JsonIgnore
    private Collection<Herbs> herbs;

    public Illness () {}

    public Illness(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<Herbs> getHerbs() {
        return herbs;
    }

    @Override
    public String toString() {
        return "Illness{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", herbs=" + herbs +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Illness illness = (Illness) o;
        return Objects.equals(id, illness.id) && Objects.equals(name, illness.name) && Objects.equals(herbs, illness.herbs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, herbs);
    }
}
