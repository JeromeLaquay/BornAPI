package com.borntobealive.BornAPI.controllers;

import com.borntobealive.BornAPI.entities.Car;
import com.borntobealive.BornAPI.entities.ReservationCar;
import com.borntobealive.BornAPI.services.ReservationCarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ReservationCarController {

    public ReservationCarController(ReservationCarService reservationCarService) {
        this.reservationCarService = reservationCarService;
    }

    private ReservationCarService reservationCarService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST, value="reservations_car", produces={MediaType.APPLICATION_JSON_VALUE}, consumes={MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ReservationCar> create(@RequestBody ReservationCar res) {
        try{
            ReservationCar res2 = reservationCarService.createOrUpdate(res);
            return new ResponseEntity<>(res2, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value="reservations_car")
    public List<ReservationCar> get() { return reservationCarService.getAll(); }

    @DeleteMapping("/reservations_car/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        Optional<ReservationCar> resCar = reservationCarService.findById(id);
        reservationCarService.delete(resCar.get());
    }

}
