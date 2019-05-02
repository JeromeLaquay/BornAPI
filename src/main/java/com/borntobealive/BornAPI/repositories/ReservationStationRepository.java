package com.borntobealive.BornAPI.repositories;

import com.borntobealive.BornAPI.entities.ReservationStation;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface ReservationStationRepository extends JpaRepository<ReservationStation, Integer>{


}
