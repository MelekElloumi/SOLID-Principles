package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarManager
{
	private final CarDB _carDB;
    private final CarNames _carNames;
    private final CarBest _carBest;

    public CarManager(CarDB carDB, CarNames carNames, CarBest carBest)
    {
        _carDB = carDB;
        _carNames = carNames;
        _carBest = carBest;
    }

    public Car getCarById(final String carId)
    {
        return _carDB.findById(carId);
    }

    public String getCarsNames()
    {
        return _carNames.getCarsNames(_carDB.findAll());
    }

    public Car getBestCar()
    {
        return _carBest.getBestCar(_carDB.findAll());
    }
}
