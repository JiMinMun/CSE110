package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature{
    public Fahrenheit(float t)
    {
        super(t);
    }
    public String toString()
    {
        // TODO: Complete this method
        return Float.toString(this.getValue()) + " F";
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius((this.getValue() - 32)*5/9);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }
}
