package com.borntobealive.BornAPI.services;

import com.borntobealive.BornAPI.entities.ReservationCar;
import com.borntobealive.BornAPI.entities.ReservationStation;
import com.borntobealive.BornAPI.repositories.ReservationCarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationCarService {

    public ReservationCarService(ReservationCarRepository reservationCarRepository) {
        this.reservationCarRepository = reservationCarRepository;
    }

    private ReservationCarRepository reservationCarRepository;

    public ReservationCar createOrUpdate(ReservationCar res) {
        return reservationCarRepository.saveAndFlush(res);
    }

    public void delete(ReservationCar res){ reservationCarRepository.delete(res);}

    public List<ReservationCar> getAll() {
        return reservationCarRepository.findAll();
    }

    public Optional<ReservationCar> findById(Integer id) {
        return reservationCarRepository.findById(id);
    }


}
