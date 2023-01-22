package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}


public class Date()
{
    public Date(String month, int day, int year)
    {
        if(price > budget)
        {
            System.out.println("Too exensive, your budget is: " + budget);
        }
        else
        {
            System.out.println("Just right")
        }






    }
}
public int saving;

public void div()
{
    mean = total / count;
}
public class Person()
{
    private String name;
    private int age;
    private String code;
    private int credits;

    public Person(String myName, int myAge)
    {
        this.name = myName;
        this.age = myAge;
        this.code = 'code';
        this.credits = 100;

    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int newAge)
    {
        age = newAge;
    }
    public void printDetails()
    {
        System.out.println("The name of the person is " + name);
    }
}
public class Module()
{
    private String code;

    public Module(String moduleCode)
    {
        this.code = moduleCode;

    }
}
public class Heater()
{
    private double temperature;
    private double min;
    private double max;
    private double increment;


    public Heater()
    {
    temperature = 15.0;
    }
    public void warmer()
    {
        if (temperature + increment >= max)
        {
            temperature = max;
            break;
        }

        temperature += increment;
    }
    public void cooler()
    {
        if (temperature - increment <= min)
        {
            temperature = min;
            break;
        }

        temperature -= increment;
    }
    public double getTemperature()
    {
        return temperature;
    }
}



