package com.borntobealive.BornAPI.controllers;

import com.borntobealive.BornAPI.entities.Station;
import com.borntobealive.BornAPI.services.StationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StationController {

    public StationController(StationService stationService) {
        this.stationService = stationService;
    }

    private StationService stationService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST, value="stations", produces={MediaType.APPLICATION_JSON_VALUE}, consumes={MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Station> create(@RequestBody Station station) {
        try{
            Station station2 = stationService.createOrUpdate(station);
            return new ResponseEntity<>(station2, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value="stations")
    public List<Station> get() { return stationService.getAll(); }
}
