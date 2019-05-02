package com.borntobealive.BornAPI.repositories;

import com.borntobealive.BornAPI.entities.Station;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface StationRepository extends JpaRepository<Station, Integer>{


}