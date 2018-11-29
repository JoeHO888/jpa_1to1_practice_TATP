package com.tw.apistackbase.core;

import javax.persistence.*;

@Entity
public class Company {
    private String name;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;


    @OneToOne(cascade = CascadeType.ALL)
    private Profile profile;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Company() {}

    public Company(String name, Profile profile) {
        this.name = name;
        this.profile = profile;
    }

}
