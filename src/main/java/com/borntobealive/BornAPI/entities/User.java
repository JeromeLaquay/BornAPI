package com.borntobealive.BornAPI.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "utilisateur")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String firstname;

    @NotNull
    private String lastname;

    @NotNull
    private String badge;

    @NotNull
    private String password;

    @NotNull
    private String email;

    @JsonIgnore
    @OneToMany(mappedBy="user")
    private List<Car> carList;

    @JsonIgnore
    @OneToMany(mappedBy="user")
    private List<ReservationCar> reservationCarList;

    @JsonIgnore
    @OneToMany(mappedBy="user")
    private List<ReservationStation> reservationStationList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBadge() {
        return badge;
    }

    public void setBadge(String badge) {
        this.badge = badge;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public List<ReservationCar> getReservationCarList() {
        return reservationCarList;
    }

    public void setReservationCarList(List<ReservationCar> reservationCarList) {
        this.reservationCarList = reservationCarList;
    }

    public List<ReservationStation> getReservationStationList() {
        return reservationStationList;
    }

    public void setReservationStationList(List<ReservationStation> reservationStationList) {
        this.reservationStationList = reservationStationList;
    }
}
