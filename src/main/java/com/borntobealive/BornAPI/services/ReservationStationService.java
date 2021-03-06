package com.borntobealive.BornAPI.services;

import com.borntobealive.BornAPI.entities.ReservationCar;
import com.borntobealive.BornAPI.entities.ReservationStation;
import com.borntobealive.BornAPI.entities.Station;
import com.borntobealive.BornAPI.repositories.ReservationStationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationStationService {

    public ReservationStationService(ReservationStationRepository reservationStationRepository) {
        this.reservationStationRepository = reservationStationRepository;
    }

    private ReservationStationRepository reservationStationRepository;

    public ReservationStation createOrUpdate(ReservationStation res) {
        return reservationStationRepository.saveAndFlush(res);
    }

    public void delete(ReservationStation res){ reservationStationRepository.delete(res);}

    public List<ReservationStation> getAll() {
        return reservationStationRepository.findAll();
    }

    public Optional<ReservationStation> findById(Integer id) {
        return reservationStationRepository.findById(id);
    }

}
