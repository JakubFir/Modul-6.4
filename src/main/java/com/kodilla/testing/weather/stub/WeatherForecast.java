package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }
    public double averageTemperature(){
        double average =0;
        double temp =0;

        for(Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            temp += temperature.getValue();
        }
        average = temp / temperatures.getTemperatures().size();
        return average;
    }
    public double getTemperatureMedian(){
        List tempInOrder = new ArrayList();

        double median =0;
        for(Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            tempInOrder.add(temperature.getValue());
        }
        Collections.sort(tempInOrder);
        if(tempInOrder.size() % 2 ==0){
            median = ((double) tempInOrder.get(tempInOrder.size()/2) + (double)tempInOrder.get(tempInOrder.size()/2-1))/2;
        }else {
            median = (double) tempInOrder.get(tempInOrder.size()/2);
        }
        return median;
    }
}