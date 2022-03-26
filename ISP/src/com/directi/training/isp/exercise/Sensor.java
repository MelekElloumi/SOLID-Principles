package com.directi.training.isp.exercise;

import java.util.Random;

public class Sensor
{
    public void register(ISensor sensorObject)
    {
        while (true) {
            if (isPersonClose()) {
                sensorObject.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}
