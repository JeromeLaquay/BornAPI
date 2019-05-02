package com.borntobealive.BornAPI.controllers;

import com.borntobealive.BornAPI.entities.Car;
import com.borntobealive.BornAPI.entities.Station;
import com.borntobealive.BornAPI.services.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    public CarController(CarService carService) {
        this.carService = carService;
    }

    private CarService carService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST, value="cars", produces={MediaType.APPLICATION_JSON_VALUE}, consumes={MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Car> create(@RequestBody Car car) {
        try{
            Car car2 = carService.createOrUpdate(car);
            return new ResponseEntity<>(car2, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value="cars")
    public List<Car> get() {
        return carService.getAll();
    }
}
