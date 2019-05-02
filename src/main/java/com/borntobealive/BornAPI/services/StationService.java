package com.borntobealive.BornAPI.services;

import com.borntobealive.BornAPI.entities.Station;
import com.borntobealive.BornAPI.repositories.StationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationService {

    public StationService(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    private StationRepository stationRepository;

    public Station createOrUpdate(Station station) {
        return stationRepository.saveAndFlush(station);
    }

    public void delete(Station station){ stationRepository.delete(station);}

    public List<Station> getAll() {
        return stationRepository.findAll();
    }
}
