package com.borntobealive.BornAPI.controllers;

import com.borntobealive.BornAPI.entities.ReservationCar;
import com.borntobealive.BornAPI.entities.ReservationStation;
import com.borntobealive.BornAPI.services.ReservationStationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ReservationStationController {

    public ReservationStationController(ReservationStationService reservationStationService) {
        this.reservationStationService = reservationStationService;
    }

    private ReservationStationService reservationStationService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST, value="reservations_station", produces={MediaType.APPLICATION_JSON_VALUE}, consumes={MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ReservationStation> create(@RequestBody ReservationStation res) {
        try{
            ReservationStation res2 = reservationStationService.createOrUpdate(res);
            return new ResponseEntity<>(res2, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value="reservations_station")
    public List<ReservationStation> get() { return reservationStationService.getAll(); }

    @DeleteMapping("/reservations_station/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        Optional<ReservationStation> resStation = reservationStationService.findById(id);
        reservationStationService.delete(resStation.get());
    }
}
