package com.borntobealive.BornAPI.repositories;

import com.borntobealive.BornAPI.entities.ReservationCar;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface ReservationCarRepository extends JpaRepository<ReservationCar, Integer>{


}