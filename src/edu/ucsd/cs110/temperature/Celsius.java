package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float get_val = this.getValue();
        Temperature far = new Fahrenheit((get_val * 9 / 5) + (float)32);
        return far;
    }

    public String toString()
    {
        // TODO: Complete this method
        return Float.toString(this.getValue()) + " C";
    }
}
