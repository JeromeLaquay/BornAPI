package com.borntobealive.BornAPI.services;

import com.borntobealive.BornAPI.entities.Car;
import com.borntobealive.BornAPI.entities.User;
import com.borntobealive.BornAPI.repositories.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    private CarRepository carRepository;

    public Car createOrUpdate(Car car) {
        return carRepository.saveAndFlush(car);
    }

    public void delete(Car car){ carRepository.delete(car);}

    public List<Car> getAll() {
        return carRepository.findAll();
    }

}
